package com.ysz.mytlvp.utils;

import android.support.v4.app.Fragment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */

public class AddFragment {
    public static List<Fragment> addFragment(Fragment... fragments) {
        Fragment[] m = fragments;
        List<Fragment> fragmentList = Arrays.asList(m);
        return fragmentList;
    }
}
