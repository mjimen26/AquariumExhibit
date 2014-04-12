package edu.fau.group6.ecoscapes.aquarium.poisontank;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import edu.fau.group6.ecoscapes.aquarium.R;

public class ToadFish extends Fragment {

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_toadfish, container, false);
         
        return rootView;
    }

}
