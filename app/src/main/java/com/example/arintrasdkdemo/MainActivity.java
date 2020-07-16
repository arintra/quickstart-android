package com.example.arintrasdkdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.healthcloudai.arintra.commons.Arintra;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchArintra = findViewById(R.id.questions_button);
        Arintra.initialize(MainActivity.this,"apikeyforarintra");

        launchArintra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // To access Questions from Arintra call accessQuestions and pass
                // context and classname which you want to be called after questions are answered
                Arintra.accessQuestions(MainActivity.this,"com.example.arintrasdkdemo.Finished");

            }
        });

    }
}