package ramim.ramim.javaBook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView  poly,encap,abstr,obj,constr,link,interfac,ab,que;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         poly = findViewById(R.id.polyID);
         encap = findViewById(R.id.encapID);
         abstr = findViewById(R.id.abstracID);
         obj = findViewById(R.id.objID);
         constr = findViewById(R.id.constrID);
         link = findViewById(R.id.linkID);
         interfac = findViewById(R.id.interID);
         ab= findViewById(R.id.aboutID);
         que=findViewById(R.id.quiesID);




         poly.setOnClickListener(this);
         encap.setOnClickListener(this);
         abstr.setOnClickListener(this);
         obj.setOnClickListener(this);
         constr.setOnClickListener(this);
         interfac.setOnClickListener(this);
         link.setOnClickListener(this);
         ab.setOnClickListener(this);
         que.setOnClickListener(this);



        Animation animation = AnimationUtils.loadAnimation( MainActivity.this,R.anim.myanimation);
        poly.startAnimation(animation);
        encap.startAnimation(animation);
        abstr.startAnimation(animation);
        obj.startAnimation(animation);
        constr.startAnimation(animation);
        interfac.startAnimation(animation);
        link.startAnimation(animation);
        ab.startAnimation(animation);
        que.startAnimation(animation);




    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case  R.id.objID:
                startActivity(new Intent(MainActivity.this,objectActivity.class));

                break;

            case R.id.polyID:
                startActivity(new Intent(MainActivity.this,PolyActivity.class));
                break;


            case R.id.constrID :
                startActivity(new Intent(MainActivity.this,ConstarActivity.class));
                break;

            case R.id.abstracID:
                startActivity(new Intent(MainActivity.this,AbstractionActivity.class ));
                break;

            case  R.id.interID :
               startActivity(new Intent(MainActivity.this,InterfaceActivity.class));
                break;

            case  R.id.encapID :
                startActivity(new Intent( MainActivity.this,EncapculationActivity.class));
                break;

            case R.id.linkID :
                startActivity(new Intent(MainActivity.this,QuizeActivity.class));
                break;

            case R. id.quiesID:
                startActivity(new Intent(MainActivity.this,QuestionActivity.class));
                break;
            case R.id.aboutID:
                startActivity(new Intent(MainActivity.this,AboutActivity.class));
                break;
        }

    }
}
