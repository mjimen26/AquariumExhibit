package edu.fau.group6.ecoscapes.aquarium;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Intent intent = new Intent(arg0, TankActivity.class);

		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		arg0.startActivity(intent);
	}

}
