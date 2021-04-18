package com.example.a3gproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Ppt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);

        //하단바 학점계산기 버튼 클릭 시 학점계산기 첫 화면으로 이동(홈화면)
        ImageButton btn_calculator = (ImageButton) findViewById(R.id.btn_calculator);
        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
            }
        });

        //하단바 체크리스트 버튼 클릭 시 체크리스트 첫 화면으로 이동
        ImageButton btn_checklist = (ImageButton) findViewById(R.id.btn_checklist);
        btn_checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Checklist.class);
                startActivity(intent);
            }
        });

        //하단바 졸업요강 버튼 클릭 시 졸업요강 첫 화면을 이동
        ImageButton btn_ppt = (ImageButton) findViewById(R.id.btn_ppt);
        btn_ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ppt.class);
                startActivity(intent);
            }
        });

        //하단바 마이페이지 버튼 클릭 시 마이페이지 첫 화면으로 이
        ImageButton btn_account = (ImageButton) findViewById(R.id.btn_mypage);
        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage.class);
                startActivity(intent);
            }
        });

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