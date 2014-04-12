package edu.fau.group6.ecoscapes.aquarium.artificialreef;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import edu.fau.group6.ecoscapes.aquarium.R;
import edu.fau.group6.ecoscapes.aquarium.adapters.ArtificialViewAdapter;

public class ArtificialReef extends FragmentActivity implements
		ActionBar.TabListener {

	private ViewPager viewPager;
	private ArtificialViewAdapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Sergeant Major", "Porkfish", "Blue Tang",
			"Spanish Hogfish", "Cuban Hogfish", "Blue Chromis", "Slippery Dick",
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

}



