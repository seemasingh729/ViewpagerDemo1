package com.example.root.viewpagerdemo;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by root on 19/7/14.
 */
public class MyPagerFragment extends Fragment
{
    String s = null;
    public MyPagerFragment(String t)
    {
        s = t;
    }
    public MyPagerFragment(){
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        ScrollView sc = (ScrollView) inflater.inflate(R.layout.fragment_my
                ,
                container, false);
        TextView tv = (TextView) sc.findViewById(R.id.textView1);
        tv.setText(s);
        return sc;
    }
}
