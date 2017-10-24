package com.ysz.mytlvp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.widget.FrameLayout;

import com.ysz.mytlvp.R;
import com.ysz.mytlvp.utils.AddTab;

import java.util.List;

/**
 * Created by Administrator on 2017/10/24.
 */

public class TabViewPager extends FrameLayout {
    private TabLayout mTab;
    private ViewPager mVp;

    public TabViewPager(@NonNull Context context) {
        super(context);
        init1(context);
    }


    public TabViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init2(context, attrs);
    }

    private void init1(Context context) {
        init(context);
    }

    private void init2(Context context, AttributeSet attrs) {
        init(context);
        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.tabViewPager);
        if (attributes != null) {
            int tabBg = attributes.getColor(R.styleable.tabViewPager_tabBackgroundColor, getResources().getColor(R.color.colorPrimary));
            mTab.setBackgroundColor(tabBg);
            int tabTc = attributes.getColor(R.styleable.tabViewPager_tabTextColor, Color.WHITE);
            int tabSTc = attributes.getColor(R.styleable.tabViewPager_tabSelectedTextColor, getResources().getColor(R.color.colorAccent));
            mTab.setTabTextColors(tabTc, tabSTc);
            int tabSTic = attributes.getColor(R.styleable.tabViewPager_tabIndicatorColor, getResources().getColor(R.color.colorAccent));
            mTab.setSelectedTabIndicatorColor(tabSTic);
            int vpc = attributes.getColor(R.styleable.tabViewPager_vpBackgroundColor, Color.WHITE);
            mVp.setBackgroundColor(vpc);
            attributes.recycle();
        }
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.tabviewpager_layout, this, true);
        mTab = findViewById(R.id.mTabLayout);
        mVp = findViewById(R.id.mViewPager);

    }

    public void setTabBackgroundColor(int color) {
        mTab.setBackgroundColor(color);
    }

    public void setTabSelectedTabIndicatorColor(int color) {
        mTab.setSelectedTabIndicatorColor(color);
    }

    public void setTabTextColors(int nomalColor, int selectedColor) {
        mTab.setTabTextColors(nomalColor, selectedColor);
    }

    public void setViewPagerBackgroundColor(int color) {
        mVp.setBackgroundColor(color);
    }

    public void setViewPagerCurrentItem(int item, boolean smomthScroll) {
        mVp.setCurrentItem(item, smomthScroll);
    }

    public void setViewPagerAnimation(Animation animation) {
        mVp.setAnimation(animation);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        mVp.addOnPageChangeListener(listener);
    }

    public void addFragmentAndTitle(List<Fragment> fragments, List<String> titles, FragmentManager m) {
        AddTab.addTab(mTab, mVp, fragments, titles, m);
    }
}
