package com.example.kitchens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(){


            public void run() {
                try {
                    sleep(4000);
                }
                catch (Exception e){ //cuz the current may be interrupted with some other thread
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
    };
        thread.start();
}
}