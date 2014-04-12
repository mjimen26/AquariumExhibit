package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.blindcave.BlindCaveFish;

public class BlindCaveViewAdapter extends FragmentPagerAdapter {

	public BlindCaveViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new BlindCaveFish();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 1;
	}

}
