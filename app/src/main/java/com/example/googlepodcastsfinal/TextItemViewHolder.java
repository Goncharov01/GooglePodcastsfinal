package com.example.googlepodcastsfinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TextItemViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    private TextView textView1;
    private ImageView imageView;
    private ImageView imageView1;


    public TextItemViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.list_item);
    }

    public void bind(String text) {
        textView.setText(text);
    }

}
