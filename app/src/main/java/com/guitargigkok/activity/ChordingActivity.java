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

public class ChordingActivity extends AppCompatActivity {

    ImageButton bt_back;
    ListView list_selectChord;
    ArrayAdapter<String> adapter;
    ImageView img_display;
    Map<String,Integer> imgContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chording);
        System.out.println("Chording init...");
        init();
        initActionButton();
        System.out.println("init completed!");
    }

    private void init(){
        bt_back = (ImageButton) findViewById(R.id.bt_back);
        img_display = (ImageView) findViewById(R.id.img_display);
        list_selectChord = (ListView) findViewById(R.id.list_selectchord);
        String[] chords = {
                "C","Cm","C#","C#m",
                "D","Dm","E","Em",
                "F","Fm","F#","F#m",
                "G","Gm","G#","G#m",
                "A","Am","B","Bm"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, chords);
        list_selectChord.setAdapter(adapter);
        imgContent = new HashMap<String,Integer>();
        imgContent.put(chords[0], R.drawable.chord_c);
        imgContent.put(chords[1], R.drawable.chord_cm);
        imgContent.put(chords[2], R.drawable.chord_cs);
        imgContent.put(chords[3], R.drawable.chord_csm);
        imgContent.put(chords[4], R.drawable.chord_d);
        imgContent.put(chords[5], R.drawable.chord_dm);
        imgContent.put(chords[6], R.drawable.chord_e);
        imgContent.put(chords[7], R.drawable.chord_em);
        imgContent.put(chords[8], R.drawable.chord_f);
        imgContent.put(chords[9], R.drawable.chord_fm);
        imgContent.put(chords[10], R.drawable.chord_fs);
        imgContent.put(chords[11], R.drawable.chord_fsm);
        imgContent.put(chords[12], R.drawable.chord_g);
        imgContent.put(chords[13], R.drawable.chord_gm);
        imgContent.put(chords[14], R.drawable.chord_gs);
        imgContent.put(chords[15], R.drawable.chord_gsm);
        imgContent.put(chords[16], R.drawable.chord_a);
        imgContent.put(chords[17], R.drawable.chord_am);
        imgContent.put(chords[18], R.drawable.chord_b);
        imgContent.put(chords[19], R.drawable.chord_bm);
    }

    private void initActionButton() {
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        list_selectChord.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object itemAtPosition = parent.getItemAtPosition(position);
                if (itemAtPosition != null) {
                    System.out.println("select : "+itemAtPosition.toString());
                    if(imgContent.get(itemAtPosition.toString())!=null){
                        img_display.setImageResource(imgContent.get(itemAtPosition.toString()));
                    }else{
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
