package edu.fau.group6.ecoscapes.aquarium;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import edu.fau.mods.modsapp.MODSIntents;

public class AquariumReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		/*
		 * Intent i = new Intent(context, TankActivity.class);
		 * i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		 * i.putExtra("screenToLaunch",
		 * intent.getStringExtra("screenToLaunch")); context.startActivity(i);
		 */

		if (intent.getAction().equals(MODSIntents.AQUARIUM)) {
			Intent i = new Intent(context, TankActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}

		if (intent.getAction().equals(MODSIntents.SHARK)) {
			Intent i = new Intent(context, SharkTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.LOBSTER)) {
			Intent i = new Intent(context, LobsterTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.LIVING)) {
			Intent i = new Intent(context, LivingReef.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.ARTIFICIAL)) {
			Intent i = new Intent(context, ArtificialReef.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.POISON)) {
			Intent i = new Intent(context, PoisonTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.SCHOOL)) {
			Intent i = new Intent(context, SchoolTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		
		if (intent.getAction().equals(MODSIntents.BLIND)) {
			Intent i = new Intent(context, BlindCaveTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
	}

}
