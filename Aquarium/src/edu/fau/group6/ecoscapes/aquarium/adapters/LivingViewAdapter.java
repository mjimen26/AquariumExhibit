package edu.fau.group6.ecoscapes.aquarium.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import edu.fau.group6.ecoscapes.aquarium.livingreef.BlueTang;
import edu.fau.group6.ecoscapes.aquarium.livingreef.BlueheadWrasse;
import edu.fau.group6.ecoscapes.aquarium.livingreef.Doctorfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.FairyBasslet;
import edu.fau.group6.ecoscapes.aquarium.livingreef.Flamefish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.HarlequinBass;
import edu.fau.group6.ecoscapes.aquarium.livingreef.Hawkfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.OrangebackBass;
import edu.fau.group6.ecoscapes.aquarium.livingreef.PincushionUrchin;
import edu.fau.group6.ecoscapes.aquarium.livingreef.Porkfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.PygmyAngelfish;
import edu.fau.group6.ecoscapes.aquarium.livingreef.RedSerpentStar;
import edu.fau.group6.ecoscapes.aquarium.livingreef.SaddleBass;
import edu.fau.group6.ecoscapes.aquarium.livingreef.SlipperyDick;
import edu.fau.group6.ecoscapes.aquarium.livingreef.TurboSnail;
import edu.fau.group6.ecoscapes.aquarium.livingreef.YellowheadWrasse;

public class LivingViewAdapter extends FragmentPagerAdapter {

	public LivingViewAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new BlueTang();
		case 1:
			return new Doctorfish();
		case 2:
			return new Hawkfish();
		case 3:
			return new Porkfish();
		case 4:
			return new Flamefish();
		case 5:
			return new PygmyAngelfish();
		case 6:
			return new FairyBasslet();
		case 7:
			return new SlipperyDick();
		case 8:
			return new YellowheadWrasse();
		case 9:
			return new TurboSnail();
		case 10:
			return new PincushionUrchin();
		case 11:
			return new RedSerpentStar();
		case 12:
			return new OrangebackBass();
		case 13:
			return new SaddleBass();
		case 14:
			return new HarlequinBass();
		case 15:
			return new BlueheadWrasse();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 16;
	}

}
