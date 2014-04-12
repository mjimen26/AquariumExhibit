package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.schooltank.Highhats;
import edu.fau.group6.ecoscapes.aquarium.schooltank.Lookdowns;
import edu.fau.group6.ecoscapes.aquarium.schooltank.PurpleReefFish;

public class SchoolViewAdapter extends FragmentPagerAdapter {

	public SchoolViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new Lookdowns();
		case 1:
			return new Highhats();
		case 2:
			return new PurpleReefFish();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
