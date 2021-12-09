package com.example.wellhydrated;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    // public static HomeFragment newInstance() {
    //     HomeFragment fragment = new HomeFragment();
    //     Bundle args = new Bundle();
    //     fragment.setArguments(args);
    //     Log.d("HomeFragment", "created new instance");
    //     return fragment;
    // }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("HomeFragment", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("HomeFragment", "onStart");
        TextView labelWaterAmount = getView().findViewById(R.id.label_water_amount);
        labelWaterAmount.setText(((MainActivity)getActivity()).getHomeInfo());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("HomeFragment", "onCreateView");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}