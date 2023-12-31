package com.example.tab_layout.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tab_layout.Activity.Catagery;

import java.util.ArrayList;

public class pager_adapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragment = new ArrayList<>();
    ArrayList<String> fregmenttitle = new ArrayList<>();

    public pager_adapter(Catagery catagery, @NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragment.get(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
    public void addfregment(Fragment frag,String title)
    {
        fragment.add(frag);
        fregmenttitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fregmenttitle.get(position);
    }
}
