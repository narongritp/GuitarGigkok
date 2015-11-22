package com.guitargigkok.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.narongritp.guitargigkok.R;

public class MainMenuActivity extends AppCompatActivity {

    ImageButton vbt_chording;//การจับคอร์ด
    ImageButton vbt_strum;//การดีด
    ImageButton vbt_setting;//การตั้งค่า
    ImageButton vbt_acous;//การเกาสาย
    ImageButton vbt_examchord;//ตัวอย่างคอร์ด
    ImageButton vbt_poweroff;//ปุ่มปิด


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        init();
        initActionButton();


    }

    private void init(){
        System.out.println("init component...");
        vbt_chording = (ImageButton) findViewById(R.id.vbt_choding);
        vbt_strum = (ImageButton) findViewById(R.id.vbt_strum);
        vbt_setting = (ImageButton) findViewById(R.id.vbt_setting);
        vbt_acous = (ImageButton) findViewById(R.id.vbt_acous);
        vbt_examchord = (ImageButton) findViewById(R.id.vbt_exchord);
        vbt_poweroff = (ImageButton) findViewById(R.id.vbt_poweroff);
        vbt_chording.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_chording.setBackgroundResource(R.drawable.bt_chording_press);
                }else{
                    vbt_chording.setBackgroundResource(R.drawable.bt_chording);
                }
                return false;
            }
        });
        vbt_strum.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_strum.setBackgroundResource(R.drawable.bt_basicstrum_press);
                }else{
                    vbt_strum.setBackgroundResource(R.drawable.bt_basicstrum);
                }
                return false;
            }
        });
        vbt_setting.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_setting.setBackgroundResource(R.drawable.bt_setting_press);
                }else{
                    vbt_setting.setBackgroundResource(R.drawable.bt_setting);
                }
                return false;
            }
        });
        vbt_acous.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_acous.setBackgroundResource(R.drawable.bt_acous_press);
                }else{
                    vbt_acous.setBackgroundResource(R.drawable.bt_acous);
                }
                return false;
            }
        });
        vbt_examchord.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_examchord.setBackgroundResource(R.drawable.bt_exchord_press);
                }else{
                    vbt_examchord.setBackgroundResource(R.drawable.bt_exchord);
                }
                return false;
            }
        });
        vbt_poweroff.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==event.ACTION_DOWN){
                    vbt_poweroff.setBackgroundResource(R.drawable.bt_poweroff_press);
                }else{
                    vbt_poweroff.setBackgroundResource(R.drawable.bt_poweroff);
                }
                return false;
            }
        });

        System.out.println("init component successful");
    }

    private void initActionButton(){
        vbt_chording.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("open chording");
                Intent intent = new Intent(MainMenuActivity.this, ChordingActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        vbt_strum.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("open strum");
                Intent intent = new Intent(MainMenuActivity.this, StrumActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        vbt_setting.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("open setting");
                Intent intent = new Intent(MainMenuActivity.this, SettingActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        vbt_acous.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("open acous");
                Intent intent = new Intent(MainMenuActivity.this, AcousActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });
        vbt_examchord.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("open exam chord");
                Intent intent = new Intent(MainMenuActivity.this, ExamChordActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
        });

        vbt_poweroff.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                System.out.println("closed app");
                finish();
            }
        });

    }
}
