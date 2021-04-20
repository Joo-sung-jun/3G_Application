package com.example.a3gproject_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

public class Mypage extends AppCompatActivity {
    private String strNick, strProfileImg, strEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

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

        Button bt_change = (Button) findViewById(R.id.bt_change);
        bt_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Change.class);
                startActivity(intent);
            }
        });


        Button bt_logout = (Button) findViewById(R.id.bt_logout);
        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Logout.class);
                startActivity(intent);
            }
        });


        //카카오톡
        Intent intent = getIntent();
        strNick = intent.getStringExtra("name");
        strProfileImg = intent.getStringExtra("profileImg");
        strEmail = intent.getStringExtra("email");

        //TextView tv_nick = findViewById(R.id.tv_nickName);
        //TextView tv_email = findViewById(R.id.tv_email);
        //ImageView iv_profile = findViewById(R.id.iv_profile);

        //tv_nick.setText(strNick);
        //tv_email.setText(strEmail);

        //Glide.with(this).load(strProfileImg).into(iv_profile);

        findViewById(R.id.bt_logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserManagement.getInstance().requestLogout(new LogoutResponseCallback() {
                    @Override
                    public void onCompleteLogout() {
                        //로그아웃 성공
                        finish();
                    }
                });
            }
        });

    }
}