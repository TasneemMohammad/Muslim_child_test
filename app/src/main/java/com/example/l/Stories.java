package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Stories extends AppCompatActivity {
    Button btn_anbyaa_stories , btn_tarbawya_stories,btn_interesting_stories;
    ImageView back_story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

back_story=findViewById(R.id.back_story);
back_story.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Stories.this,Anbyaa_Stories.class);
        startActivity(intent);

    }
});
    }
}
