package com.example.abhi.jsshndemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.abhi.jsshndemo.R;
import com.example.abhi.jsshndemo.fragments.inner.InnerData;
import com.example.abhi.jsshndemo.fragments.outer.OuterAdapter;
import com.ramotion.garlandview.TailLayoutManager;
import com.ramotion.garlandview.TailRecyclerView;
import com.ramotion.garlandview.TailSnapHelper;
import com.ramotion.garlandview.header.HeaderTransformer;

import java.util.ArrayList;
import java.util.List;


public class ScheduleFragment extends Fragment {
    private final static int OUTER_COUNT = 2;
    private final static int INNER_COUNT = 4;
    List<List<InnerData>> outerData = new ArrayList<>();
    TailRecyclerView rv;
    public static Fragment newInstance() {
        ScheduleFragment fragment = new ScheduleFragment();
      return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for(int i=0;i<OUTER_COUNT;i++){
            List<InnerData> innerData = new ArrayList<>();
            innerData.add(new InnerData("CODERZ","Coding event","12:00"));
            innerData.add(new InnerData("Mechavoltz","Technical event","13:00"));
            innerData.add(new InnerData("Colaralo","Cultural event","15:00"));
            innerData.add(new InnerData("Robotiles","Robotics event","15:00"));
            innerData.add(new InnerData("Robotiles","Robotics event","15:00"));
            innerData.add(new InnerData("Robotiles","Robotics event","15:00"));

            outerData.add(innerData);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_schedule, container,false);
        rv = (TailRecyclerView)view.findViewById(R.id.recycler_view);
        initRecyclerView(outerData);
        // Inflate the layout for this fragment
        return view;

    }
    private void initRecyclerView(List<List<InnerData>> data){
        ((TailLayoutManager)rv.getLayoutManager()).setPageTransformer(new HeaderTransformer());
        rv.setAdapter(new OuterAdapter(data,getActivity()));
        new TailSnapHelper().attachToRecyclerView(rv);

    }


}
