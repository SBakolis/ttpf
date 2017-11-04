package com.ttpf.sickstatup.tabletoppartyfinder;

/**
 * Created by Stamatis on 04-Nov-17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                 layout.FragmentMain1 tab1 = new layout.FragmentMain1();
                 return tab1;
            case 1:
                layout.FragmentMain2 tab2 = new layout.FragmentMain2();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
