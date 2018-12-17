package com.app.coordinate.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.coordinate.R;
import com.app.coordinate.data.MyData;
import com.app.coordinate.ui.MainActivity;
import com.app.coordinate.ui.ParallaxEffectToolbarActivity;
import com.app.coordinate.ui.ToolbarShowHideActivity;

import java.util.List;

public class ToolbarShowHideAdapter extends RecyclerView.Adapter<ToolbarShowHideAdapter.MyViewHolder> {

    private List<MyData> dataSet;
    private ToolbarShowHideActivity activity;

    public ToolbarShowHideAdapter(ToolbarShowHideActivity activity, List<MyData> data) {
        this.dataSet = data;
        this.activity = activity;
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

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final LinearLayout linearRoot;
        TextView tvName;
        TextView tvAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.tv_name);
            this.tvAddress = (TextView) itemView.findViewById(R.id.tv_address);
            this.linearRoot = (LinearLayout) itemView.findViewById(R.id.linear_root);
        }

        public void setData(MyData data) {
            tvName.setText(data.getName());
            tvAddress.setText(data.getAddress());

            linearRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(activity, ParallaxEffectToolbarActivity.class);
                    activity.startActivity(i);
                }
            });
        }

    }

}

