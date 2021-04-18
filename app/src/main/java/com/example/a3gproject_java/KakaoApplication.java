package com.example.a3gproject_java;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super. onCreate();

        KakaoSdk.init(this, "59d523ee90ee6c6976f371910563fd88");

}
