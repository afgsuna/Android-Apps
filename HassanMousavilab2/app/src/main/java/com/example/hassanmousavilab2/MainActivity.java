package com.example.hassanmousavilab2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewGroup tContainer;
    TextView text;
    Button button;
    Button button2;
    Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tContainer = findViewById(R.id.transationContainer);
        text = findViewById(R.id.textView);
        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {

                TransitionManager.beginDelayedTransition(tContainer);

                visible = !visible;

                text.setVisibility(visible ? View.VISIBLE:  View.GONE);

            }
        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity_picture(); }});

        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openActivity_Grid(); }});
    }

    public void openActivity_picture(){
        Intent intent = new Intent (this, Picture.class);
        startActivity(intent);
    }

    public void openActivity_Grid(){
        Intent intent = new Intent (this, Grid.class);
        startActivity(intent);
    }

}