package com.test.yinbing.testviewpage.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.test.yinbing.testviewpage.fragment.TestFragment;

import java.util.List;

/**
 * Created by yinbing on 16-3-15.
 */
public class FragmentAdapter extends FragmentPagerAdapter{

    private List<Fragment> fragments;

    public FragmentAdapter(FragmentManager fm,List<Fragment> fragments){
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public Fragment getItem(int position) {
        return new TestFragment();
    }
}
