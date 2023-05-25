package com.example.tab_layout.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.example.tab_layout.Adapter.pager_adapter;
import com.example.tab_layout.R;
import com.example.tab_layout.fragment.info;
import com.example.tab_layout.fragment.menu;
import com.example.tab_layout.fragment.photo;
import com.google.android.material.tabs.TabLayout;

public class Catagery extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    int position;
    String image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagery);
        viewPager=findViewById(R.id.view_pager);
        tabLayout=findViewById(R.id.tab_layout);
        image=getIntent().getStringExtra("image");
        position=getIntent().getIntExtra("position",0);
        pager_adapter pager_adapter = new pager_adapter(this,getSupportFragmentManager());
        viewPager.setAdapter(pager_adapter);
        pager_adapter.addfregment(new info(position,image),"Info");
        pager_adapter.addfregment(new photo(position),"Photo");
        pager_adapter.addfregment(new menu(position),"Menu");
        tabLayout.setupWithViewPager(viewPager);


    }
}