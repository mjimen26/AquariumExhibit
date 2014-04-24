package edu.fau.group6.ecoscapes.aquarium;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import edu.fau.group6.ecoscapes.aquarium.adapters.LobsterViewAdapter;

public class LobsterTank extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private LobsterViewAdapter mAdapter;
	private ActionBar actionBar;
	Context context = this;
	
	// Tab titles
	private String[] tabs = { "Slipper Lobster", "Spiny Lobster" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		actionBar = getActionBar();
		mAdapter = new LobsterViewAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	
	public void onClick(View v) {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

		// Set the title
		alertDialogBuilder.setTitle("Did You Know?");

		alertDialogBuilder.setMessage(fishSwitcher(v)).setCancelable(false)
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
					}
				});
		
		AlertDialog alertDialog = alertDialogBuilder.create();
		alertDialog.show();

	}

	public String fishSwitcher(View v) {
		View view = v;

		switch (view.getId()) {

		case R.id.slipperlobster_image:
			return FishSwitcher.otherTank[0];
		case R.id.spinylobster_image:
			return FishSwitcher.sharkTank[2];
		}

		return "No such Fish";
	}

}
