package edu.fau.group6.ecoscapes.aquarium;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import edu.fau.group6.ecoscapes.aquarium.artificialreef.ArtificialReef;
import edu.fau.group6.ecoscapes.aquarium.blindcave.BlindCaveTank;
import edu.fau.group6.ecoscapes.aquarium.livingreef.LivingReef;
import edu.fau.group6.ecoscapes.aquarium.lobstertank.LobsterTank;
import edu.fau.group6.ecoscapes.aquarium.poisontank.PoisonTank;
import edu.fau.group6.ecoscapes.aquarium.schooltank.SchoolTank;
import edu.fau.group6.ecoscapes.aquarium.sharktank.SharkTank;

/**
 * TankActivity is the launcher activity for the aquarium It contains ImageViews
 * for each tank in the exhibit.
 */
public class TankActivity extends Activity {

	Context context = this;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tank_layout);
	}

	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.living_reef_img: // Open Living Reef Tank
			Intent ex1 = new Intent(context, LivingReef.class);
			startActivity(ex1);
			break;

		case R.id.artifical_img: // Open Artificial Reef Tank
			Intent ex2 = new Intent(context, ArtificialReef.class);
			startActivity(ex2);
			break;

		case R.id.shark_img: // Open Shark Tank
			Intent ex3 = new Intent(context, SharkTank.class);
			startActivity(ex3);
			break;

		case R.id.lobster_img: // Open Lobster Tank
			Intent ex4 = new Intent(context, LobsterTank.class);
			startActivity(ex4);
			break;

		case R.id.poison_img: // Open Poisonous Tank
			Intent ex5 = new Intent(context, PoisonTank.class);
			startActivity(ex5);
			break;

		case R.id.school_img: // Open School Reef
			Intent ex6 = new Intent(context, SchoolTank.class);
			startActivity(ex6);
			break;

		case R.id.cave_img: // Open Cave Tank
			Intent ex7 = new Intent(context, BlindCaveTank.class);
			startActivity(ex7);
			break;

		case R.id.back_btn:
			Intent intent = new Intent();
			ComponentName cName = new ComponentName(
					"edu.fau.mods.modsapp",
					"edu.fau.mods.modsapp.EcoscapeActivity");

			intent.setComponent(cName);
			startActivity(intent);
		}

	}

}
