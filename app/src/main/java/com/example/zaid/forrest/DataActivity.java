package com.example.zaid.forrest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.zaid.forrest.Models.DataAdapter;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter dataAdapter;
    private ArrayList<String> dataList;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        dataList = new ArrayList<>();
        dataList = getIntent().getStringArrayListExtra("dataList");
        dataAdapter = new DataAdapter(dataList, this);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(dataAdapter);
        //Toast.makeText(this, String.valueOf(dataList.size()), Toast.LENGTH_SHORT).show();
    }
}
