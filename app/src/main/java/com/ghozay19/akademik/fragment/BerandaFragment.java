package com.ghozay19.akademik.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ghozay19.akademik.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    ViewPager mViewPager;
    TabLayout mTablayout;


    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
        mViewPager.setAdapter(new sliderAdapter(getChildFragmentManager()));

        mTablayout = (TabLayout) view.findViewById(R.id.tab_layout);
        mTablayout.setupWithViewPager(mViewPager);

        mTablayout.post(new Runnable() {
            @Override
            public void run() {
                mTablayout.setupWithViewPager(mViewPager);
            }
        });

        mTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

    private class sliderAdapter extends FragmentPagerAdapter {

        String home = getResources().getString(R.string.home);
        String dosen = getResources().getString(R.string.dosen);
        String mahasiswa = getResources().getString(R.string.mahasiswa);
        final String tabs[] = {home, dosen, mahasiswa};

        public sliderAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new HomeFragment();
                case 1:
                    return new DosenFragment();
                case 2:
                    return new MahasiswaFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return tabs.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }

}
