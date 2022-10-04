package com.example.affirmation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.affirmation.R;
import com.example.affirmation.model.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    Context context;
    List<Affirmation> dataset;
    public ItemAdapter(Context context, List<Affirmation> dataset){
        this.context = context;
        this.dataset = dataset;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;
        private final ImageView imageView;
        public ItemViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.item_title);
            imageView = view.findViewById(R.id.item_image);
        }

    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        int str = (int) dataset.get(position).getStringResourceId() ;
        int img = dataset.get(position).getImageResourceId();
        holder.textView.setText(context.getResources().getString(str) );
        holder.imageView.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }


}
