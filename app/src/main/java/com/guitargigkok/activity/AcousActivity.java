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

public class AcousActivity extends AppCompatActivity {

    ImageButton bt_back;
    ListView list_selectMode;
    ArrayAdapter<String> adapter;
    ImageView img_display;
    Map<String,Integer> imgContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acous);
        System.out.println("Chording init...");
        init();
        initActionButton();
        System.out.println("init completed!");
    }

    private void init(){
        bt_back = (ImageButton) findViewById(R.id.bt_back);
        img_display = (ImageView) findViewById(R.id.img_display);
        list_selectMode = (ListView) findViewById(R.id.list_selectmode);
        String[] chords = {
                "#1","#2","#3"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chords);
        list_selectMode.setAdapter(adapter);
        imgContent = new HashMap<String,Integer>();
        imgContent.put(chords[0],R.drawable.chord_a);
        imgContent.put(chords[1],R.drawable.chord_b);
        imgContent.put(chords[2],R.drawable.chord_c);
    }

    private void initActionButton() {
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        list_selectMode.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object itemAtPosition = parent.getItemAtPosition(position);
                if (itemAtPosition != null) {
                    System.out.println("select : " + itemAtPosition.toString());
                    if (imgContent.get(itemAtPosition.toString()) != null) {
                        img_display.setImageResource(imgContent.get(itemAtPosition.toString()));
                    } else {
                        img_display.setImageResource(R.drawable.icon_noimg);
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
