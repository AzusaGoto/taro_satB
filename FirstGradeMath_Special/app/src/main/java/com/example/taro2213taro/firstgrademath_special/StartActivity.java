package com.example.taro2213taro.firstgrademath_special;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hogosya(View v){
        new AlertDialog.Builder(this)
                .setTitle("保護者の方へ")
                .setMessage("このアプリをご利用いただき有難うございます。" + "\n" +
                        "このアプリは支援が必要な方へのアプリです。" + "\n" +
                        "お子様に合わない点があるかもしれませんが、" + "\n" +
                        "ご理解くださるようお願いします。")
                .setPositiveButton("終了", null)
                .show();
    }
    public void HelpStart(View v){
        new AlertDialog.Builder(this)
                .setTitle("もんだいのときかた"+"\n")
                .setMessage("もんだいのときかた"+"\n"+"\n"+"がめんのまんなかに"+"\n"+"もんだいがでます"+"\n"+"それのこたえをしたのボタンから"+"\n"+
                        "えらんでこたえてください"+"\n"+"\n"+"\n"+"もんだいがわからないとき"+"\n"+"\n"+"みぎうえにある「たすけて！」ボタンを"+"\n"+"おしてください")
                .setPositiveButton("OK!!", null)
                .show();
    }
    public void StartMath(View v){
        Intent intent = new Intent(this, MainActivity.class);  //インテントの作成
        startActivity(intent);
    }
}
