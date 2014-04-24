package edu.fau.group6.ecoscapes.aquarium;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AquariumReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {

		if ((intent.getStringExtra("screenToLaunch")).equals("aquarium")) {
			Intent i = new Intent(context, TankActivity.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("livingreef")){
			Intent i = new Intent(context, LivingReef.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("artificialreef")){
			Intent i = new Intent(context, ArtificialReef.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("sharktank")){
			Intent i = new Intent(context, SharkTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("lobstertank")){
			Intent i = new Intent(context, LobsterTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("poisontank")){
			Intent i = new Intent(context, PoisonTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("schooltank")){
			Intent i = new Intent(context, SchoolTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
		else if ((intent.getStringExtra("screenToLaunch")).equals("blindtank")){
			Intent i = new Intent(context, BlindCaveTank.class);
			i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(i);
		}
	}

}
