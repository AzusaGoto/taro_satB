package com.example.taro2213taro.firstgrademath_special;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayAdapter adapter;

    String plusone;
    String minusone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listview = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1);

        listview.setAdapter(adapter);

        plusone="ひとけたの足し算  (1+1~)";
        minusone="ひとけたのひき算  (1-1~)";


        //リスト追加スペース
        adapter.add(plusone);
        adapter.add(minusone);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Toast.makeText(getApplicationContext(), plusone, Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, HitoketaplusActivity.class);  //インテントの作成
                    startActivity(intent2);

                }
                if (position == 1) {
                    Toast.makeText(getApplicationContext(), minusone, Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, HitoketaminusActivity.class);  //インテントの作成
                    startActivity(intent2);
                }
            }
        });


    }
}
