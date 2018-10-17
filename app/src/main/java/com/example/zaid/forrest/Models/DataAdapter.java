package com.example.zaid.forrest.Models;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zaid.forrest.DataActivity;
import com.example.zaid.forrest.MainActivity;
import com.example.zaid.forrest.R;

import java.util.ArrayList;

/**
 * Created by zaid on 16/10/18.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    View rootView;
    TextView dataView;
    ArrayList<String> dataList;
    public DataAdapter(ArrayList<String> dataList, DataActivity dataActivity) {
        this.dataList = dataList;
        //Toast.makeText(dataActivity, "The Size is: " +String.valueOf(this.dataList.size()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item, parent, false);
        return new MyViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        String data = dataList.get(position);
        holder.setup(data);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
            dataView = itemView.findViewById(R.id.dataText);
        }
        public void setup(String data){
            dataView.setText(data);
        }
    }
}
