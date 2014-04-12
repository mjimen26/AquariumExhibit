package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.sharktank.CatShark;
import edu.fau.group6.ecoscapes.aquarium.sharktank.Dogfish;
import edu.fau.group6.ecoscapes.aquarium.sharktank.SpinyLobster;

public class SharkViewAdapter extends FragmentPagerAdapter {

	public SharkViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new CatShark();
		case 1:
			return new Dogfish();
		case 2:
			return new SpinyLobster();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
