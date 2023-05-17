package com.example.databinding_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding_demo.databinding.ItemManBinding;

import java.util.List;

public class Man_Adapter extends RecyclerView.Adapter<Man_Adapter.ManViewHolder> {

    private List<Man_bindable> mList;

    public Man_Adapter(List<Man_bindable> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public Man_Adapter.ManViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemManBinding binding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_man,parent,false);
        return new ManViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Man_Adapter.ManViewHolder holder, int position) {
        Man_bindable man_bindable=mList.get(position);
        holder.getBinding().setSwordsman(man_bindable);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ManViewHolder extends RecyclerView.ViewHolder {
        ItemManBinding binding;

        public ManViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding=(ItemManBinding) binding;
        }

        public ItemManBinding getBinding(){
            return binding;
    }
}
}
