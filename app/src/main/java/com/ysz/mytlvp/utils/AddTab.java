package com.ysz.mytlvp.utils;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */

public class AddTab {
    public static void addTab(TabLayout tabLayout, ViewPager viewPager, final List<Fragment> fragments,
                              final List<String> titles, FragmentManager fragmentManager) {
        if (fragments.size() == titles.size()) {
            /**
             * 预加载
             */
            viewPager.setOffscreenPageLimit(fragments.size());
            viewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
                @Override
                public Fragment getItem(int position) {
                    return fragments.get(position);
                }

                @Override
                public int getCount() {
                    return fragments.size();
                }

                @Override
                public CharSequence getPageTitle(int position) {
                    return titles.get(position);
                }
            });
            // TabLayout关联ViewPager
            tabLayout.setupWithViewPager(viewPager);
        } else {
            throw new IndexOutOfBoundsException("fragments size must equivalent to titles size");
        }
    }
}
