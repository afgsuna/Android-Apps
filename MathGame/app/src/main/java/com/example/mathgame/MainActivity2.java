package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.playButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_main3();
            }
        });

        button2 = (Button) findViewById(R.id.scroeButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_main4();
            }
        });

        button3 = (Button) findViewById(R.id.helpButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity_main5();
            }
        });


    }

    public void openActivity_main3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }

    public void openActivity_main4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }

    public void openActivity_main5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);

    }
}