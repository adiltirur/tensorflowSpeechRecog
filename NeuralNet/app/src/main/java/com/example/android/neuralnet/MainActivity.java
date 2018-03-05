package com.example.android.neuralnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button detbtn;

        public void init(){
            detbtn = (Button)findViewById(R.id.button2);
            detbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent details = new Intent(MainActivity.this,details.class);
                    startActivity(details);


                }
            });
        }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
    }

    public void openConvNetKeyword(View view){
        Intent openConvNetKeywordapp = getPackageManager().getLaunchIntentForPackage("org.tensorflow.demo");
        startActivity(openConvNetKeywordapp);
    }
}
