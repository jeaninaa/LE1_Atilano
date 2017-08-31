package com.example.jeanina.le1_atilano;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.pm.ActivityInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_Seatworks;
    EditText et_Lab;
    EditText et_Exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.etQuiz1);
        et_Quiz2 = (EditText) findViewById(R.id.etQuiz2);
        et_Seatworks = (EditText) findViewById(R.id.etSeatworks);
        et_Lab = (EditText) findViewById(R.id.etLab);
        et_Exam = (EditText) findViewById(R.id.etExam);
    }


    public void submit (View view){

        double q1 = Double.parseDouble(et_Quiz1.toString());
        double q2 = Double.parseDouble(et_Quiz2.toString());
        double sw = Double.parseDouble(et_Seatworks.toString());
        double le = Double.parseDouble(et_Lab.toString());
        double me = Double.parseDouble(et_Exam.toString());

        double ra = (q1 * 0.1) + (q2 * 0.1) + (sw * 0.1) + (le * 0.4) + (me * 0.3);
        String ave = Double.toString(ra);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("RA", ave);
        startActivity(intent);
    }
}
