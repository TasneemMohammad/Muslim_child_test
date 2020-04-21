package com.example.l;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Recycler_Adapter_Stories extends RecyclerView.Adapter<Recycler_Adapter_Stories.ViewHolderStories> {
   Context context ;
   ArrayList<Stories_Card> arrayList ;
   OnClickListener_Stories listener_stories ;
  // LinearLayout linearLayout ;
   String htmlFiles[] ;
   int    MP3Sounds [] ;
    public Recycler_Adapter_Stories( ArrayList<Stories_Card> arrayList , OnClickListener_Stories listener_stories ) {
       this.listener_stories = listener_stories;
        this.arrayList = arrayList;
     //   this.context = context ;
       // this.htmlFiles = htmlFiles ;
    }
    /*
     public Recycler_Adapter_Stories(  Context context ,ArrayList<Stories_Card> arrayList , OnClickListener_Stories listener_stories ) {
       this.listener_stories = listener_stories;
        this.arrayList = arrayList;
        this.context = context ;
       // this.htmlFiles = htmlFiles ;
    }
     */

    @NonNull
    @Override
    public ViewHolderStories onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_stories_layout,null,false);
        ViewHolderStories viewHolderStories = new ViewHolderStories(v);
        return viewHolderStories;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderStories holder, int position) {
        Stories_Card c =  arrayList.get(position);
        holder.img_story .setImageResource(c.getImg());
        holder.tv_story_name.setText(c.getNameStory());
        holder.getAdapterPosition();
      /* final String htmlfile = htmlFiles[position];
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, webView_AnbyaaStories.class);
                intent.putExtra("file",htmlfile);
               intent.putExtra("sound", );
               context.startActivity(intent);
                webView_AnbyaaStories.sound.stop();
                webView_AnbyaaStories.sound.reset();
            }
        }); */
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    class ViewHolderStories extends RecyclerView.ViewHolder{
        ImageView img_story ;
        TextView tv_story_name;
        LinearLayout linearLayout;
        public ViewHolderStories(@NonNull View itemView) {
            super(itemView);
            img_story = itemView.findViewById(R.id.img_story);
            tv_story_name = itemView.findViewById(R.id.tv_story_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener_stories.onClick(getAdapterPosition());
                }
            });
          //  linearLayout = itemView.findViewById(R.id.linearlayout);

        }
    }
}
