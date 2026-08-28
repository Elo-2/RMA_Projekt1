package com.example.miniimdb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private final List<Actor> actorList;

    public ActorAdapter(List<Actor> actorList) {
        this.actorList = actorList;
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_actor, parent, false);

        return new ActorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ActorViewHolder holder,
            int position) {

        Actor actor = actorList.get(position);

        holder.actorName.setText(actor.getName());

        if (actor.getImageResId() != 0) {
            holder.actorImage.setImageResource(actor.getImageResId());
        }
    }

    @Override
    public int getItemCount() {
        return actorList.size();
    }

    public static class ActorViewHolder extends RecyclerView.ViewHolder {

        ImageView actorImage;
        TextView actorName;

        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);

            actorImage = itemView.findViewById(R.id.actorImage);
            actorName = itemView.findViewById(R.id.actorName);
        }
    }
}
