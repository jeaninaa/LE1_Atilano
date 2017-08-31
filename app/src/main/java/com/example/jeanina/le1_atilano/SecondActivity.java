package com.example.jeanina.le1_atilano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String raw = getIntent().getStringExtra("RA");
        double rAve = Double.parseDouble(raw);
        String fgrade = "0";

        if (rAve > 60){
            fgrade = "Failed";
        } else if (rAve >= 60 && rAve <= 65){
            fgrade = "3.0";
        } else if (rAve >= 66 && rAve <= 70){
            fgrade = "2.75";
        } else if (rAve >= 71 && rAve <= 75){
            fgrade = "2.5";
        } else if (rAve >= 76 && rAve <= 80){
            fgrade = "2.25";
        } else if (rAve >= 81 && rAve <= 85){
            fgrade = "2.0";
        } else if (rAve >= 86 && rAve <= 90){
            fgrade = "1.75";
        } else if (rAve >= 91 && rAve <= 92){
            fgrade = "1.5";
        } else if (rAve >= 93 && rAve <= 94){
            fgrade = "1.25";
        } else if (rAve >= 95 && rAve <= 100){
            fgrade = "1.0";
        }

        TextView t_ra = (TextView) findViewById(R.id.tRA);
        TextView t_final = (TextView) findViewById(R.id.tFinal);
        Button btn_Back = (Button) findViewById(R.id.btnBack);
        t_ra.setText("Your RA is " + rAve);
        t_final.setText("Your final grade is " + fgrade);
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}