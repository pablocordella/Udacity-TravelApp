package com.example.android.travelapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Pablo on 24-Aug-16.
 */
public class TravelAppPagerAdapter extends FragmentPagerAdapter {

    public TravelAppPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
         if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            return new MuseumFragment();
        } else if( position == 2) {
            return new EntertaimentFragment();
        } else if( position == 3) {
            return new EventFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

}
