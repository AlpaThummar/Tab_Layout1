package com.example.tab_layout.Adapter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tab_layout.Activity.Catagery;
import com.example.tab_layout.Activity.MainActivity;
import com.example.tab_layout.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class recycle_adapter extends RecyclerView.Adapter<recycle_adapter.user_holder> {
    MainActivity mainActivity;
    ArrayList <String> imagearr;

    public recycle_adapter(MainActivity mainActivity, ArrayList<String> imagearr) {
        this.mainActivity = mainActivity;
        this.imagearr =imagearr;
    }
    @NonNull
    @Override
    public recycle_adapter.user_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recycle_item,parent,false);
        user_holder user_holder = new user_holder(view);
        return user_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycle_adapter.user_holder holder, int position) {
        InputStream stream = null;
        try {
            stream = mainActivity.getAssets().open("image/"+imagearr.get(position));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Drawable drawable = Drawable.createFromStream(stream,null);
        holder.imageView.setImageDrawable(drawable);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainActivity, Catagery.class);
                intent.putExtra("position",holder.getAdapterPosition());
                intent.putExtra("image",imagearr.get(holder.getAdapterPosition()));
                mainActivity.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return imagearr.size();
    }

    public class user_holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public user_holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.Main_image);
        }
    }
}
