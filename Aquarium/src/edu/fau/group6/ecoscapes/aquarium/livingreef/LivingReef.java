package edu.fau.group6.ecoscapes.aquarium.livingreef;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import edu.fau.group6.ecoscapes.aquarium.R;
import edu.fau.group6.ecoscapes.aquarium.adapters.LivingViewAdapter;

public class LivingReef extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private LivingViewAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Blue Tang", "Doctorfish", "Hawkfish",
			"Porkfish", "Flamefish", "Angelfish", "Fairy Basslet",
			"Slippery Dick", "Yellow Wrasse", "Turbo Snail",
			"Pincushion", "Serpent Star", "Orange Back", 
			"Saddle Bass", "Harlequin", "Blue Wrasse"};

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

}



