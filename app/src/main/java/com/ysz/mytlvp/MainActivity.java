package com.ysz.mytlvp;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ysz.mytlvp.views.TabViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> titles;
    private List<Fragment> fragments;
    private TabViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = (TabViewPager) findViewById(R.id.vp);
        titles = new ArrayList<>();
        fragments = new ArrayList<>();
        titles.add("体育");
        titles.add("新闻");
        BlankFragment fragment1 = new BlankFragment();
        Bundle bundle1 = new Bundle();
        bundle1.putString("ddd", "体育");
        fragment1.setArguments(bundle1);
        BlankFragment fragment2 = new BlankFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("ddd", "新闻");
        fragment2.setArguments(bundle2);
        fragments.add(fragment1);
        fragments.add(fragment2);
        vp.addFragmentAndTitle(fragments, titles, getSupportFragmentManager());
        vp.setTabSelectedTabIndicatorColor(Color.YELLOW);
        vp.setTabTextColors(Color.WHITE, Color.YELLOW);
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
