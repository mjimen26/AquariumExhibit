package edu.fau.group6.ecoscapes.aquarium.livingreef;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import edu.fau.group6.ecoscapes.aquarium.R;

public class PygmyAngelfish extends Fragment {

	WebView mWebView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_pygmyangelfish,
				container, false);

		return rootView;
	}

}