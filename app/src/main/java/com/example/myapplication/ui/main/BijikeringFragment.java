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
public class BijikeringFragment extends Fragment {


    public BijikeringFragment() {
        // Required empty public constructor
    }

    public static BijikeringFragment newInstance(){
        return new BijikeringFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bijikering, container, false);
    }

}
