package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.BicolorDamsel;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.BlueChromis;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.ClownWrasse;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.CubanHogfish;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.SergeantMajor;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.SpanishHogfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.BlueTang;
import edu.fau.group6.ecoscapes.aquarium.livingreef.BlueheadWrasse;
import edu.fau.group6.ecoscapes.aquarium.livingreef.Porkfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.SlipperyDick;
import edu.fau.group6.ecoscapes.aquarium.livingreef.TurboSnail;
import edu.fau.group6.ecoscapes.aquarium.livingreef.YellowheadWrasse;

public class ArtificialViewAdapter extends FragmentPagerAdapter {

	public ArtificialViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new SergeantMajor();
		case 1:
			return new Porkfish();
		case 2:
			return new BlueTang();
		case 3:
			return new SpanishHogfish();
		case 4:
			return new CubanHogfish();
		case 5:
			return new BlueChromis();
		case 6:
			return new SlipperyDick();
		case 7:
			return new ClownWrasse();
		case 8:
			return new YellowheadWrasse();
		case 9:
			return new TurboSnail();
		case 10:
			return new BicolorDamsel();
		case 11:
			return new BlueheadWrasse();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 12;
	}

}
