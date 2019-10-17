package com.exampletest4321;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.exampletest4321.fragment.AFragment;
import com.exampletest4321.fragment.BFragment;

/**
 * author:       bearshih
 * project:      test
 * date:         2019/10/9
 * version:
 * description:
 */
public class DemoPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTitles;

    public DemoPagerFragmentAdapter(FragmentManager fm, String... titles) {
        super(fm);
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0://todo  到時候要改
                return AFragment.newInstance("", "");
            case 1:
                return BFragment.newInstance("", "");
        }
        return null;
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // 看看我這邊跟原本寫法不一樣 會發生 甚麼事?
        return mTitles[position];
    }
}
