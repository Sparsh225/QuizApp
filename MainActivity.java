package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private  String [] questions={"Java is a person ","Java was Introduced in 1863? ","Java was created using python?",
            "Java has abstract classes?","Java Support interface?"};
    private boolean [] answers={false,false,false,true,true};
    private int index=0;
    private int score=0;
    Button yes;
    Button no;

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        textview=findViewById(R.id.textView2);
        textview.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(answers[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        textview.setText(questions[index]);
                    }else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        textview.setText(questions[index]);
                    }else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                    }else{
                    Toast.makeText(MainActivity.this, "Restart to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}