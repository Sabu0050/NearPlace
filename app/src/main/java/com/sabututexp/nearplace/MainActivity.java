package com.sabututexp.nearplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sabututexp.nearplace.adapter.CatagoryAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter mCategoryAdapter;
    private RecyclerView.LayoutManager mCategoryLayoutManager;

    @BindView(R2.id.catagoryRecyclerView)
    RecyclerView mCategoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mCategoryRecyclerView.setNestedScrollingEnabled(false);
        mCategoryRecyclerView.setHasFixedSize(false);

        mCategoryLayoutManager = new LinearLayoutManager(MainActivity.this);
        mCategoryRecyclerView.setLayoutManager(mCategoryLayoutManager);
        mCategoryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mCategoryAdapter = new CatagoryAdapter(getDataSetCatagory(), MainActivity.this);
        mCategoryRecyclerView.setAdapter(mCategoryAdapter);
        mCategoryAdapter.notifyDataSetChanged();


    }

    private ArrayList resultsHistory = new ArrayList<String>();
    private List<String> getDataSetCatagory() {
        resultsHistory.add("accounting");resultsHistory.add("airport");resultsHistory.add("amusement_park");resultsHistory.add("aquarium");resultsHistory.add("art_gallery");
        resultsHistory.add("atm");resultsHistory.add("bakery");resultsHistory.add("bank");resultsHistory.add("bar");resultsHistory.add("beauty_salon");
        resultsHistory.add("bicycle_store");resultsHistory.add("book_store");resultsHistory.add("bowling_alley");resultsHistory.add("bus_station");resultsHistory.add("cafe");
        resultsHistory.add("campground");resultsHistory.add("car_dealer");resultsHistory.add("car_rental");resultsHistory.add("car_repair");resultsHistory.add("car_wash");
        resultsHistory.add("casino");resultsHistory.add("cemetery");resultsHistory.add("church");resultsHistory.add("city_hall");resultsHistory.add("clothing_store");
        resultsHistory.add("convenience_store");resultsHistory.add("courthouse");resultsHistory.add("dentist");resultsHistory.add("department_store");resultsHistory.add("doctor");
        resultsHistory.add("electrician");resultsHistory.add("electronics_store");resultsHistory.add("embassy");resultsHistory.add("establishment");resultsHistory.add("finance");
        resultsHistory.add("fire_station");resultsHistory.add("florist");resultsHistory.add("food");resultsHistory.add("funeral_home");resultsHistory.add("furniture_store");
        resultsHistory.add("gas_station");resultsHistory.add("general_contractor");resultsHistory.add("grocery_or_supermarket");resultsHistory.add("gym");resultsHistory.add("hair_care");
        resultsHistory.add("hardware_store");resultsHistory.add("health");resultsHistory.add("hindu_temple");resultsHistory.add("home_goods_store");resultsHistory.add("hospital");
        resultsHistory.add("insurance_agency");resultsHistory.add("jewelry_store");resultsHistory.add("laundry");resultsHistory.add("lawyer");resultsHistory.add("library");
        resultsHistory.add("liquor_store");resultsHistory.add("local_government_office");resultsHistory.add("locksmith");resultsHistory.add("lodging");resultsHistory.add("meal_delivery");
        resultsHistory.add("meal_takeaway");resultsHistory.add("mosque");resultsHistory.add("movie_rental");resultsHistory.add("movie_theater");resultsHistory.add("moving_company");
        resultsHistory.add("museum");resultsHistory.add("night_club");resultsHistory.add("painter");resultsHistory.add("park");resultsHistory.add("parking");
        resultsHistory.add("pet_store");resultsHistory.add("pharmacy");resultsHistory.add("physiotherapist");resultsHistory.add("place_of_worship");resultsHistory.add("plumber");
        resultsHistory.add("police");resultsHistory.add("post_office");resultsHistory.add("real_estate_agency");resultsHistory.add("restaurant");resultsHistory.add("roofing_contractor");
        resultsHistory.add("rv_park");resultsHistory.add("school");resultsHistory.add("shoe_store");resultsHistory.add("shopping_mall");resultsHistory.add("spa");
        resultsHistory.add("stadium");resultsHistory.add("storage");resultsHistory.add("store");resultsHistory.add("subway_station");resultsHistory.add("synagogue");
        resultsHistory.add("taxi_stand");resultsHistory.add("train_station");resultsHistory.add("transit_station");resultsHistory.add("travel_agency");resultsHistory.add("university");
        resultsHistory.add("veterinary_care");resultsHistory.add("zoo");

       // mCategoryAdapter.notifyDataSetChanged();

        return resultsHistory;
    }
}
