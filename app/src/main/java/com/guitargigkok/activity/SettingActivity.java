package com.guitargigkok.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.narongritp.guitargigkok.R;

import java.util.HashMap;

public class SettingActivity extends AppCompatActivity {

    ImageButton bt_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        System.out.println("Chording init...");
        init();
        initActionButton();
        System.out.println("init completed!");
    }

    private void init(){
        bt_back = (ImageButton) findViewById(R.id.bt_back);
    }

    private void initActionButton() {
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
