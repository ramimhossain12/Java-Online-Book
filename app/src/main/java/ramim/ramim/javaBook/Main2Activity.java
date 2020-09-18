package ramim.ramim.javaBook;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class Main2Activity extends AppCompatActivity {
    private static  int timeout =6000;
    LazyLoader lazyLoader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        lazyLoader = findViewById(R.id.lazyloderID);

        LazyLoader loader = new LazyLoader(this, 30, 20,
                ContextCompat.getColor(this, R.color.backgroundcolor),
                ContextCompat.getColor(this, R.color.green),
                ContextCompat.getColor(this, R.color.yellow));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());




        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Main2Activity.this,SignInActivity.class);
                startActivity(intent);
                finish();
            }
        },timeout);
    }
    }

