package com.sabututexp.nearplace.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sabututexp.nearplace.R;

import java.util.List;

/**
 * Created by s on 11/10/17.
 */

public class CatagoryAdapter extends RecyclerView.Adapter<CatagoryViewHolder> {
    private List<String> itemList;
    private Context context;

    public CatagoryAdapter(List<String> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public CatagoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.catagory_view, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);
        CatagoryViewHolder rcv = new CatagoryViewHolder(layoutView);
        return rcv;

    }

    @Override
    public void onBindViewHolder(CatagoryViewHolder holder, int position) {
        holder.catagoryTextView.setText(itemList.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
