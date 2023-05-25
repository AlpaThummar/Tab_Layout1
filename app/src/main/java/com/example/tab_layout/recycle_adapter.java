package com.example.tab_layout;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycle_adapter extends RecyclerView.Adapter<recycle_adapter.user_holder> {
    @NonNull
    @Override
    public recycle_adapter.user_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull recycle_adapter.user_holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class user_holder extends RecyclerView.ViewHolder {
        public user_holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
