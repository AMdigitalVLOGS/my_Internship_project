package com.amdigitalvlogs.internship08;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.amdigitalvlogs.internship08.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TRIPPLAN_Fragment extends Fragment {
    LinearLayout linear_add;


    public TRIPPLAN_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tripplan, container, false);
        linear_add = view.findViewById(R.id.linear_add);
        linear_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Add another plan !", Toast.LENGTH_LONG).show();

            }
        });

        return view;
    }


}
