package com.example.attraction;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecycelrView extends RecyclerView.Adapter<ModelRecycelrView.ViewHolder> {

    Context context;
    ArrayList<Model> arrayList = new ArrayList<>();

    public ModelRecycelrView(Context context, ArrayList<Model> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView.setText(arrayList.get(position).getName());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name"+position, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("Image", arrayList.get(position).getImage());
                intent.putExtra("Name", arrayList.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.CardImage);
            textView = itemView.findViewById(R.id.CardName);
            cardView = itemView.findViewById(R.id.CardView);
        }
    }
}

