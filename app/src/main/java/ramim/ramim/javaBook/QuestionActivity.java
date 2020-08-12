package ramim.ramim.javaBook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {



    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);



        textView = findViewById(R.id.ques2ID);

        Animation animation = AnimationUtils.loadAnimation( QuestionActivity.this,R.anim.myanimation);
        textView.startAnimation(animation);



    }
}
