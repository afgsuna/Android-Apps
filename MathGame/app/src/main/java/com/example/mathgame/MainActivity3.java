package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button startButton, answerButton0, answerButton1, answerButton2, answerButton3;
    TextView timerText, scoreText, questionText, messageText;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        startButton =  findViewById(R.id.startButton);
        answerButton0 = findViewById(R.id.answerButton0);
        answerButton1 = findViewById(R.id.answerButton1);
        answerButton2 = findViewById(R.id.answerButton2);
        answerButton3 = findViewById(R.id.answerButton3);

        timerText = findViewById(R.id.timerText);
        scoreText = findViewById(R.id.scoreText);
        questionText = findViewById(R.id.questionText);
        messageText = findViewById(R.id.messageTextView);

        progressBar = findViewById(R.id.progressBar);



        timerText.setText("0Sec");
        questionText.setText("");
        messageText.setText("Press Go");
        scoreText.setText("0pts");


        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });



    }
}