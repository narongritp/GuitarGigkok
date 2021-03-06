package com.guitargigkok.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.narongritp.guitargigkok.R;

import java.util.HashMap;
import java.util.Map;

public class ExamChordActivity extends AppCompatActivity {

    ImageButton bt_back;
    ListView list_selectSong;
    ArrayAdapter<String> adapter;
    ImageView img_display1;
    ImageView img_display2;
    Map<String,Integer> imgContent1;
    Map<String,Integer> imgContent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examchord);
        System.out.println("Chording init...");
        init();
        initActionButton();
        System.out.println("init completed!");
    }

    private void init(){
        bt_back = (ImageButton) findViewById(R.id.bt_back);
        img_display1 = (ImageView) findViewById(R.id.img_display1);
        img_display2 = (ImageView) findViewById(R.id.img_display2);
        list_selectSong = (ListView) findViewById(R.id.list_selectsong);
        String[] chords = {
                "#1","#2","#3"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chords);
        list_selectSong.setAdapter(adapter);
        imgContent1 = new HashMap<String,Integer>();
        imgContent1.put(chords[0],R.drawable.examchord_1_1);
        imgContent1.put(chords[1],R.drawable.examchord_2_1);
        imgContent1.put(chords[2], R.drawable.examchord_3_1);
        imgContent2 = new HashMap<String,Integer>();
        imgContent2.put(chords[0],R.drawable.examchord_1_2);
        imgContent2.put(chords[1],R.drawable.examchord_2_2);
        imgContent2.put(chords[2],R.drawable.examchord_3_2);

    }

    private void initActionButton() {
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        list_selectSong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object itemAtPosition = parent.getItemAtPosition(position);
                if (itemAtPosition != null) {
                    System.out.println("select : " + itemAtPosition.toString());
                    if (imgContent1.get(itemAtPosition.toString()) != null) {
                        img_display1.setImageResource(imgContent1.get(itemAtPosition.toString()));
                        img_display2.setImageResource(imgContent2.get(itemAtPosition.toString()));
                    } else {
                        img_display1.setImageResource(R.drawable.icon_noimg);
                    }
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
