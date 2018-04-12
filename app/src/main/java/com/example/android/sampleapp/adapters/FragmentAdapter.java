package com.example.android.sampleapp.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.android.sampleapp.fragments.ThirdActivityFragmentFourth;
import com.example.android.sampleapp.fragments.ThirdActivityFragmentOne;
import com.example.android.sampleapp.fragments.ThirdActivityFragmentThird;
import com.example.android.sampleapp.fragments.ThirdActivityFragmentTwo;

public class FragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Page 1", "Page 2", "Page 3", "Page 4" };
    private Context mContext;

    public FragmentAdapter (FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch(position) {
            case 0:
                fragment = new ThirdActivityFragmentOne();
                break;
            case 1:
                fragment =  new ThirdActivityFragmentTwo();
                break;
            case 2:
                fragment =  new ThirdActivityFragmentThird();
                break;
            case 3:
                fragment =  new ThirdActivityFragmentFourth();
                break;
            default:
                fragment = new ThirdActivityFragmentOne();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
