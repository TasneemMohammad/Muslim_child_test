package com.example.l;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Educational_Stories extends AppCompatActivity {
    RecyclerView rv_educational_stories;
    DataBase_Stories db ;
    ArrayList<Stories_Card> Stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational__stories);
        rv_educational_stories = findViewById(R.id.rv_educational_stories);
        db = new DataBase_Stories(this);
        rv_educational_stories = (RecyclerView)findViewById(R.id.rv_educational_stories);
        Stories = new ArrayList<>();        // khleh yget men el data base ;
        Stories_Card story1 = new Stories_Card("قصة الأسد والأرنب" ,R.drawable.icon);
        Stories_Card story2 = new Stories_Card("قصة الأسد والأرنب" ,R.drawable.icon);
        Stories_Card story3 = new Stories_Card("قصة الأسد والأرنب" ,R.drawable.icon);
        Stories_Card story4 = new Stories_Card("قصة الأسد والأرنب" ,R.drawable.icon);
        Stories_Card story5 = new Stories_Card("قصة الأسد والأرنب" ,R.drawable.icon);
        db.insertStory(story1);
        db.insertStory(story2);
        db.insertStory(story3);
        db.insertStory(story4);
        db.insertStory(story5);
        Stories = db.getAllStories();
        Recycler_Adapter_Stories adapter_stories = new Recycler_Adapter_Stories(Stories, new OnClickListener_Stories() {
            @Override
            public void onClick(int position) {

            }
        });
      /*  Recycler_Adapter_Stories adapter_stories = new Recycler_Adapter_Stories(Educational_Stories.this, Stories, new OnClickListener_Stories() {
            @Override
            public void onClick(int[] MP3Sounds) {
            }
        }
        ); */
            /*
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(Educational_Stories.this, webView_AnbyaaStories.class);
                intent.putExtra("page",position);
                intent.putExtra("sound",position);
                startActivity(intent);
            }});  */

     //   rv_educational_stories.setAdapter(adapter_stories);
        rv_educational_stories.setLayoutManager(new LinearLayoutManager(Educational_Stories.this));
    }}
