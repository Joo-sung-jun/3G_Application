package com.example.a3gproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Checklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        Button btn_calculator = (Button) findViewById(R.id.btn_calculator);
        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
            }
        });

        Button btn_jeongong = (Button) findViewById(R.id.btn_go_jeongong);
        btn_jeongong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Checklist_jeongong.class);
                startActivity(intent);
            }
        });
    }
}