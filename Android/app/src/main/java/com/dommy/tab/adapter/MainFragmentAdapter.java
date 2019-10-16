package com.dommy.tab.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dommy.tab.fragment.ContactFragment;
import com.dommy.tab.fragment.FindFragment;
import com.dommy.tab.fragment.MeFragment;
import com.dommy.tab.fragment.MsgFragment;
import com.dommy.tab.fragment.addFragment;


public class MainFragmentAdapter extends FragmentPagerAdapter {
    public MainFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new MsgFragment();
                break;
            case 1:
                fragment = new ContactFragment();
                break;
            case 2:
                fragment = new FindFragment();
                break;
            case 3:
                fragment = new MeFragment();
                break;
            case 4:
                fragment = new addFragment();

            default:
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

}
