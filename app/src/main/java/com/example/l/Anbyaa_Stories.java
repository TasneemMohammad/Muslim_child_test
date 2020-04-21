package com.example.l;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import java.util.ArrayList;
public class Anbyaa_Stories extends AppCompatActivity {
   // webView_AnbyaaStories webView_anbyaaStories ;
    RecyclerView rv_anbyaa_stories ;
    DataBase_Stories db ;
    ArrayList<Stories_Card> Stories;
   //  int [] MB3Sounds = {R.raw.sydnaadam,R.raw.sydnaebraheem};
  //   String [] htmlFile = new String[]{"test"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anbyaa__stories);
        db = new DataBase_Stories(this);
        rv_anbyaa_stories = (RecyclerView)findViewById(R.id.rv_anbyaa_stories);

              // khleh yget men el data base ;
    Stories_Card story1 = new Stories_Card("قصة أدم" ,R.drawable.icon);
    Stories_Card story2= new Stories_Card("قصة إبراهيم" ,R.drawable.icon);
       /* Stories_Card story3 = new Stories_Card("قصة يوسف" ,R.drawable.icon);
        Stories_Card story4= new Stories_Card("قصة يوسف" ,R.drawable.icon);
        Stories_Card story5 = new Stories_Card("قصة يوسف" ,R.drawable.icon); */
        db.insertStory(story1);
        db.insertStory(story2);
        Stories = db.getAllStories();
         Recycler_Adapter_Stories adapter_stories = new Recycler_Adapter_Stories(Stories, new OnClickListener_Stories() {
             @Override
             public void onClick(int position) {
             //    String [] htmlFile = new String[]{"test"};
                 Intent intent = new Intent(Anbyaa_Stories.this, webView_AnbyaaStories.class);
                // intent.putExtra("page",position);
            //   intent.putExtra("sound",position);
                 startActivity(intent);
             }
         });
       /* Recycler_Adapter_Stories adapter_stories = new Recycler_Adapter_Stories(Stories, new OnClickListener_Stories() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(Anbyaa_Stories.this, webView_AnbyaaStories.class);


                startActivity(intent);
               webView_AnbyaaStories.sound.stop();
               webView_AnbyaaStories.sound.reset();
            }}); */

       /* db.insertStory(story3);
        db.insertStory(story4);
        db.insertStory(story5); */

        rv_anbyaa_stories.setAdapter(adapter_stories);
        rv_anbyaa_stories.setLayoutManager(new LinearLayoutManager(Anbyaa_Stories.this));


    }
}
