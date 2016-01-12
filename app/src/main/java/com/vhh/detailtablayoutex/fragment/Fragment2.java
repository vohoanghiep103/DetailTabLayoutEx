package com.vhh.detailtablayoutex.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vhh.detailtablayoutex.R;

/**
 * Created by VHH on 12-Jan-16.
 */
public class Fragment2 extends android.support.v4.app.Fragment {

    public static Fragment2 newInstance() {
        return new Fragment2();
    }

    public Fragment2() {
        //Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frg2, container, false);
    }
}
