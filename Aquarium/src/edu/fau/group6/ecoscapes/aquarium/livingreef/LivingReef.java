package edu.fau.group6.ecoscapes.aquarium.livingreef;

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
import edu.fau.group6.ecoscapes.aquarium.FishSwitcher;
import edu.fau.group6.ecoscapes.aquarium.R;
import edu.fau.group6.ecoscapes.aquarium.adapters.LivingViewAdapter;

public class LivingReef extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private LivingViewAdapter mAdapter;
	private ActionBar actionBar;
	Context context = this;

	// Tab titles
	private String[] tabs = { "Blue Tang", "Doctorfish", "Hawkfish",
			"Porkfish", "Flamefish", "Angelfish", "Fairy Basslet",
			"Slippery Dick", "Yellow Wrasse", "Turbo Snail", "Pincushion",
			"Serpent Star", "Orange Back", "Saddle Bass", "Harlequin",
			"Blue Wrasse" };

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		actionBar = getActionBar();
		mAdapter = new LivingViewAdapter(getSupportFragmentManager());

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

		case R.id.bluetang_image:
			return FishSwitcher.livingReef[0];
		case R.id.doctorfish_image:
			return FishSwitcher.livingReef[1];
		case R.id.hawkfish_image:
			return FishSwitcher.livingReef[2];
		case R.id.porkfish_image:
			return FishSwitcher.livingReef[3];
		case R.id.flamefish_image:
			return FishSwitcher.livingReef[4];
		case R.id.angelfish_image:
			return FishSwitcher.livingReef[5];
		case R.id.fairybass_image:
			return FishSwitcher.livingReef[6];
		case R.id.slipperydick_image:
			return FishSwitcher.livingReef[7];
		case R.id.yellowhead_image:
			return FishSwitcher.livingReef[8];
		case R.id.turbosnail_image:
			return FishSwitcher.livingReef[9];
		case R.id.pincushion_image:
			return FishSwitcher.livingReef[10];
		case R.id.redstar_image:
			return FishSwitcher.livingReef[11];
		case R.id.orangeback_image:
			return FishSwitcher.livingReef[12];
		case R.id.saddlebass_image:
			return FishSwitcher.livingReef[13];
		case R.id.harlequin_image:
			return FishSwitcher.livingReef[14];
		case R.id.bluehead_image:
			return FishSwitcher.livingReef[15];
		}

		return "No such Fish";
	}

}
