package com.example.jacoblewis.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends Activity{
    @Override
    protected void onCreate (Bundle savedInstanceState){
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    onPause();
                    startActivity(new Intent("com.example.jacoblewis.calculator"));
                }
            }
        };
    }
@Override
    public void onPause(){
    super.onPause();
    finish();
}
}





