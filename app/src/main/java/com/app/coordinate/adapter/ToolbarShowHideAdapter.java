package com.app.coordinate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.coordinate.R;
import com.app.coordinate.data.MyData;

import java.util.List;

public class ToolbarShowHideAdapter extends RecyclerView.Adapter<ToolbarShowHideAdapter.MyViewHolder> {

    private List<MyData> dataSet;


    public ToolbarShowHideAdapter(List<MyData> data) {
        this.dataSet = data;
    }


    private MyData getItem(int pos) {
        return dataSet.get(pos);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_toolbar_show_hide, parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        MyData data = getItem(listPosition);
        holder.setData(data);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.tv_name);
            this.tvAddress = (TextView) itemView.findViewById(R.id.tv_address);
        }

        public void setData(MyData data) {
            tvName.setText(data.getName());
            tvAddress.setText(data.getAddress());
        }
    }

}

