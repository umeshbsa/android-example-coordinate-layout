package com.app.coordinate.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.app.coordinate.R;
import com.app.coordinate.adapter.ToolbarShowHideAdapter;
import com.app.coordinate.data.MyData;

public class ToolbarShowHideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_show_hide);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Coordinate Layout");
        setSupportActionBar(toolbar);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        ToolbarShowHideAdapter adapter = new ToolbarShowHideAdapter(MyData.getData());
        recyclerView.setAdapter(adapter);

    }
}
