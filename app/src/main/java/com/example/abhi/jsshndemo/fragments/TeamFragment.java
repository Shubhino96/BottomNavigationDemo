package com.example.abhi.jsshndemo.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abhi.jsshndemo.R;
import com.example.abhi.jsshndemo.adapters.TeamAdapter;
import com.example.abhi.jsshndemo.models.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class TeamFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private ArrayList<Person> list=new ArrayList<Person>();
    public TeamFragment() {
        // Required empty public constructor
    }


    public static Fragment newInstance() {
        TeamFragment fragment = new TeamFragment();

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
        View v=inflater.inflate(R.layout.fragment_team, container, false);
        list.add(new Person("MMIL","technical society"));
        list.add(new Person("GDG","google developers group"));
        list.add(new Person("QUANTA","electronics society"));
        list.add(new Person("MMIL","technical society"));
        mRecyclerView = (RecyclerView) v.findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mRecyclerView.getContext()));
        mRecyclerView.setAdapter(new TeamAdapter(mRecyclerView.getContext(), list));
        return v;
    }




}
