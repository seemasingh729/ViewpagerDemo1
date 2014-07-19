package com.example.root.viewpagerdemo;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

import java.util.ArrayList;


public class MyActivity extends FragmentActivity {
    ViewPager vp;
    PagerAdapter pa;
    ArrayList<String> al;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        vp = (ViewPager)findViewById(R.id.viewPager1);
        al = new ArrayList<String>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");

        pa = new MyFragmentAdapter(getSupportFragmentManager());
        vp.setAdapter(pa);

    }

    private class MyFragmentAdapter extends FragmentStatePagerAdapter{
        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int spos) {
            return new MyPagerFragment(al.get(spos));
        }
        @Override
        public int getCount() {
            return al.size();
        }
    }


}
