package com.ghozay19.akademik.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ghozay19.akademik.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DosenFragment extends Fragment {


    public DosenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dosen, container, false);
    }

}
