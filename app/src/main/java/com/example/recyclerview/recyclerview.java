package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerview extends RecyclerView.Adapter<recyclerview.recyclerviewholder> {
    @NonNull

    private String[] data;
    public recyclerview(String[] data)
    {
        this.data=data;
    }

    public recyclerviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recyclerview_layout,parent,false);
        return new recyclerviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewholder holder, int position) {
        String title=data[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class recyclerviewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public recyclerviewholder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.icon2);
            textView=(TextView) itemView.findViewById(R.id.txt);
        }
    }
}
