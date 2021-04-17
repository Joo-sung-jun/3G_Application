package com.example.a3gproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //하단바 학점계산기 버튼 클릭 시 학점계산기 첫 화면으로 이동(홈화면)
        Button btn_calculator = (Button) findViewById(R.id.btn_calculator);
        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculator.class);
                startActivity(intent);
            }
        });

        //하단바 체크리스트 버튼 클릭 시 체크리스트 첫 화면으로 이동
        Button btn_checklist = (Button) findViewById(R.id.btn_checklist);
        btn_checklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Checklist.class);
                startActivity(intent);
            }
        });

        //하단바 졸업요강 버튼 클릭 시 졸업요강 첫 화면을 이동
        Button btn_ppt = (Button) findViewById(R.id.btn_ppt);
        btn_ppt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ppt.class);
                startActivity(intent);
            }
        });

        //하단바 마이페이지 버튼 클릭 시 마이페이지 첫 화면으로 이
        Button btn_account = (Button) findViewById(R.id.btn_mypage);
        btn_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mypage.class);
                startActivity(intent);
            }
        });
    }
}