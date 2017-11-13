package com.sabututexp.nearplace.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sabututexp.nearplace.R;
import com.sabututexp.nearplace.activities.MapsActivity;

/**
 * Created by s on 11/10/17.
 */

public class CatagoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
    public TextView catagoryTextView;

    public CatagoryViewHolder(View itemView) {
        super(itemView);
        catagoryTextView = (TextView) itemView.findViewById(R.id.categoryId);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext().getApplicationContext(), MapsActivity.class);
        Bundle b = new Bundle();
        b.putString("catagoryItem", catagoryTextView.getText().toString());
        intent.putExtras(b);
        view.getContext().startActivity(intent);
    }
}
