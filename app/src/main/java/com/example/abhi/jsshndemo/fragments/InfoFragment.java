package com.example.abhi.jsshndemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.abhi.jsshndemo.R;
import com.example.abhi.jsshndemo.adapters.PagerAdapter;

import java.util.ArrayList;


public class InfoFragment extends Fragment {
    CollapsingToolbarLayout collapsingToolbarLayout;
    private ViewPager mViewPager;
    TabLayout mTabLayout;

    ArrayList<Fragment> frags=new ArrayList<>();

    public static Fragment newInstance() {
        InfoFragment fragment = new InfoFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        collapsingToolbarLayout=(CollapsingToolbarLayout)view.findViewById(R.id.collapsing_toolbar);
        mTabLayout=(TabLayout)view.findViewById(R.id.tab_layout);
        mViewPager=(ViewPager)view.findViewById(R.id.pager);
        frags.add(new TeamFragment());
        frags.add(new DeveloperFragment());
        mViewPager.setAdapter(new PagerAdapter(getFragmentManager(), frags));
    }
}