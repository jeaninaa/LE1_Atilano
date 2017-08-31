package com.example.jeanina.le1_atilano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button btn_back;
    TextView t_ra;
    TextView t_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String rawAve = getIntent().getStringExtra("RA");
        String finalGrade = getIntent().getStringExtra("grade");

        t_ra= (TextView) findViewById(R.id.tRA);
        t_final = (TextView) findViewById(R.id.tFinal);
        btn_back = (Button) findViewById(R.id.btnBack);

        t_ra.setText("Your RA is " + rawAve);
        t_final.setText("Your final grade is " + finalGrade);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}