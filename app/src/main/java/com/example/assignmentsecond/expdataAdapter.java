package com.example.assignmentsecond;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class expdataAdapter extends RecyclerView.Adapter<expdataAdapter.VersionVH> {
    

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VersionVH extends RecyclerView.ViewHolder {
        public VersionVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
