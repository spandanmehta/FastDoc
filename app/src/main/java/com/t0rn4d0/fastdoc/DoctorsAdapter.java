package com.t0rn4d0.fastdoc;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
public class DoctorsAdapter extends RecyclerView.Adapter<DoctorsAdapter.DoctorViewHolder>{

    private ArrayList<Doctor> mDataSet;

    public DoctorsAdapter(ArrayList<Doctor> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @Override
    public DoctorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.doctor_row, parent, false);
        DoctorViewHolder doctorViewHolder = new DoctorViewHolder(v);
        return doctorViewHolder;
    }

    @Override
    public void onBindViewHolder(DoctorViewHolder holder, int position) {
        holder.name_entry.setText(mDataSet.get(position).getName());
        holder.degree_entry.setText(mDataSet.get(position).getDeg());
        holder.experience_entry.setText(mDataSet.get(position).getExp());
        holder.address_entry.setText(mDataSet.get(position).getAdd());
        holder.phone_entry.setText(mDataSet.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public static class DoctorViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView name_entry, degree_entry, experience_entry, address_entry, phone_entry;

        DoctorViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.doctor_layout);
            name_entry = (TextView) itemView.findViewById(R.id.name_entry);
            degree_entry = (TextView) itemView.findViewById(R.id.degree_entry);
            experience_entry = (TextView) itemView.findViewById(R.id.experience_entry);
            address_entry = (TextView) itemView.findViewById(R.id.address_entry);
            phone_entry = (TextView) itemView.findViewById(R.id.phone_entry);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
