package com.example.jeanina.le1_atilano;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.pm.ActivityInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_Seatworks;
    EditText et_Lab;
    EditText et_Exam;
    Button btn_Compute;

    double q1, q2, sw, le, me;

    String fgrade = "0.0";
    double rAve;
    String ra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.etQuiz1);
        et_Quiz2 = (EditText) findViewById(R.id.etQuiz2);
        et_Seatworks = (EditText) findViewById(R.id.etSeatworks);
        et_Lab = (EditText) findViewById(R.id.etLab);
        et_Exam = (EditText) findViewById(R.id.etExam);
        btn_Compute = (Button) findViewById(R.id.btnCompute);
    }

    public void submit (View view){
        q1 = Double.parseDouble(et_Quiz1.getText().toString());
        q2 = Double.parseDouble(et_Quiz2.getText().toString());
        sw = Double.parseDouble(et_Seatworks.getText().toString());
        le = Double.parseDouble(et_Lab.getText().toString());
        me = Double.parseDouble(et_Exam.getText().toString());

        rAve = ((q1 * 0.1) + (q2 * 0.1) + (sw * 0.1) + (le * 0.4) + (me * 0.3));

        if (rAve < 60) {
            fgrade = "5.0";
        } else if (rAve >= 60 && rAve <= 65) {
            fgrade = "3.0";
        } else if (rAve >= 66 && rAve <= 70) {
            fgrade = "2.75";
        } else if (rAve >= 71 && rAve <= 75) {
            fgrade = "2.5";
        } else if (rAve >= 76 && rAve <= 80) {
            fgrade = "2.25";
        } else if (rAve >= 81 && rAve <= 85) {
            fgrade = "2.0";
        } else if (rAve >= 86 && rAve <= 90) {
            fgrade = "1.75";
        } else if (rAve >= 91 && rAve <= 92) {
            fgrade = "1.5";
        } else if (rAve >= 93 && rAve <= 94) {
            fgrade = "1.25";
        } else if (rAve >= 95 && rAve <= 100) {
            fgrade = "1.0";
        } else {
            fgrade = "0.0";
        }

        ra = Double.toString(rAve);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("RA", ra);
        intent.putExtra("grade", fgrade);
        startActivity(intent);
    }
}
