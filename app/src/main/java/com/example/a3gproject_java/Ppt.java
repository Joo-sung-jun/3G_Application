package com.example.a3gproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ppt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

        Button grade_one = (Button) findViewById(R.id.grade_one);
        grade_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/p/s!AuRcqUg2k-bthzeOqCjc3ySlO8Vp?e=7ja6pk"));
                startActivity(intent);
            }
        });

        Button grade_two = (Button) findViewById(R.id.grade_two);
        grade_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/p/s!AuRcqUg2k-bthzm2mWY-pZfLHh5q?e=iznJEF"));
                startActivity(intent);
            }
        });

        Button grade_three= (Button) findViewById(R.id.grade_three);
        grade_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/p/s!AuRcqUg2k-bthzwh-jUP57WqMYkN?e=XrKHi9"));
                startActivity(intent);
            }
        });

        Button grade_four= (Button) findViewById(R.id.grade_four);
        grade_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://1drv.ms/p/s!AuRcqUg2k-bthzQEZV2GQF_TithZ?e=H6Ic1H"));
                startActivity(intent);
            }
        });
    }
}