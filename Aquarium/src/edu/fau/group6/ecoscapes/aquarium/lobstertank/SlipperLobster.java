package edu.fau.group6.ecoscapes.aquarium.lobstertank;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.fau.group6.ecoscapes.aquarium.R;

public class SlipperLobster extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_slipperlobster, container, false);
         
        return rootView;
    }

}