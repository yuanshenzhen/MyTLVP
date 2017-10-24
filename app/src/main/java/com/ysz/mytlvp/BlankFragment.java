package com.ysz.mytlvp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ysz.mytlvp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String ttt = getArguments().getString("ddd");
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView tv = view.findViewById(R.id.tv);
        tv.setText(ttt);
        return view;
    }

}
