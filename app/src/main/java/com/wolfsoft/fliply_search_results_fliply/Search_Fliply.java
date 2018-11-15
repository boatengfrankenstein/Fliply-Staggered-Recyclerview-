package com.wolfsoft.fliply_search_results_fliply;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import adapter.Search_Results_Adapter;
import model.Search_Results_Fliply_Model;

public class Search_Fliply extends AppCompatActivity {


    private Search_Results_Adapter search_results_adapter;
    private RecyclerView recyclerview;
    private ArrayList<Search_Results_Fliply_Model> search_results_fliply_modelArrayList;

    Integer bitmap5[]={R.drawable.bitmap5,R.drawable.bitmap6,R.drawable.bitmap8,R.drawable.bitmap7};
    Integer imgrs[]={R.drawable.ic_rupee,R.drawable.ic_rupee,R.drawable.ic_rupee,R.drawable.ic_rupee};
    String txtdji[]={"DJI Phantom Pro","DJI Mavic Pro","DJI Phantom Pro","DJI Mavic Pro"};
    String txtprice[]={"1,49,000","45,000","1,49,000","45,000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__fliply);

        recyclerview = findViewById(R.id.recycler2);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        search_results_fliply_modelArrayList = new ArrayList<>();

        for (int i = 0; i < bitmap5.length; i++) {
            Search_Results_Fliply_Model view = new Search_Results_Fliply_Model(bitmap5[i],imgrs[i],txtdji[i],txtprice[i]);
            search_results_fliply_modelArrayList.add(view);
        }
        search_results_adapter = new Search_Results_Adapter(Search_Fliply.this,search_results_fliply_modelArrayList);
        recyclerview.setAdapter(search_results_adapter);
    }
}
