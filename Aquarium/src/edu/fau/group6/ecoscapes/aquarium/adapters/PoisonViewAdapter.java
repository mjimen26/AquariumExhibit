package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.poisontank.Balloonfish;
import edu.fau.group6.ecoscapes.aquarium.poisontank.Burrfish;
import edu.fau.group6.ecoscapes.aquarium.poisontank.HorseConch;
import edu.fau.group6.ecoscapes.aquarium.poisontank.ScorpionFish;
import edu.fau.group6.ecoscapes.aquarium.poisontank.ToadFish;

public class PoisonViewAdapter extends FragmentPagerAdapter {

	public PoisonViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new ScorpionFish();
		case 1:
			return new Balloonfish();
		case 2:
			return new ToadFish();
		case 3:
			return new Burrfish();
		case 4:
			return new HorseConch();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 5;
	}

}
