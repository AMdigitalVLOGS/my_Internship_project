package com.amdigitalvlogs.internship08;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amdigitalvlogs.internship08.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class STARTTRIPFragment extends Fragment {


    public STARTTRIPFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_starttrip, container, false);
    }

}
