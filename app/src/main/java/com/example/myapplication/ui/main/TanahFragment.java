package com.example.myapplication.ui.main;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TanahFragment extends Fragment {


    public TanahFragment() {
        // Required empty public constructor
    }

    public static TanahFragment newInstance(){
        return new TanahFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tanah, container, false);
    }

}
