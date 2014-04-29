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
import edu.fau.group6.ecoscapes.aquarium.adapters.ArtificialViewAdapter;

public class ArtificialReef extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private ArtificialViewAdapter mAdapter;
	private ActionBar actionBar;
	Context context = this;
	
	// Tab titles
	private String[] tabs = { "Porkfish",  "Blue Tang",  "Blue Chromis",
			"Spanish Hogfish", "Cuban Hogfish",  "Sergeant Major", "Slippery Dick",
			"Clown Wrasse", "Yellow Wrasse", "Turbo Snail",
			"Bicolor Damsel", "Blue Wrasse"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager);
		
		// Initilization
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		actionBar = getActionBar();
		mAdapter = new ArtificialViewAdapter(getSupportFragmentManager());

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

		case R.id.sergeantmajor_image:
			return FishSwitcher.artificialReef[0];
		case R.id.porkfish_image:
			return FishSwitcher.livingReef[3];
		case R.id.bluetang_image:
			return FishSwitcher.livingReef[0];
		case R.id.shogfish_image:
			return FishSwitcher.artificialReef[1];
		case R.id.chogfish_image:
			return FishSwitcher.artificialReef[2];
		case R.id.chromis_image:
			return FishSwitcher.artificialReef[3];
		case R.id.slipperydick_image:
			return FishSwitcher.livingReef[7];
		case R.id.clownwrasse_image:
			return FishSwitcher.artificialReef[4];
		case R.id.yellowhead_image:
			return FishSwitcher.livingReef[8];
		case R.id.turbosnail_image:
			return FishSwitcher.livingReef[9];
		case R.id.damsel_image:
			return FishSwitcher.artificialReef[5];
		case R.id.bluehead_image:
			return FishSwitcher.livingReef[15];
		}

		return "No such Fish";
	}

}



