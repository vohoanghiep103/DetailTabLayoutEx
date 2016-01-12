package com.vhh.detailtablayoutex;

import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Display;

import com.vhh.detailtablayoutex.fragment.Fragment1;
import com.vhh.detailtablayoutex.fragment.Fragment2;
import com.vhh.detailtablayoutex.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////////////////////////////////////
        // Get size of screen
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int screenWidth = size.x;
        ///////////////////////////////////////////


        ////////////////////////////////////////////
        //
        //  TABs
        //
        ///////////////////////////////////////////
        //Cài đặt toolbar thay cho actionbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Cài đặt viewPager
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        //Khởi tạo các tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        //Sử dụng method dưới sẽ tự sinh viewPager's count với tên tab từ getPageTitle()
        tabLayout.setTabsFromPagerAdapter(pagerAdapter);

        //Method dưới đảm bảo các tab được chọn sẽ cập nhật viewpager
        tabLayout.setupWithViewPager(viewPager);
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                case 0: return Fragment1.newInstance();
                case 1: return Fragment2.newInstance();
                case 2: return Fragment3.newInstance();
                default: return Fragment1.newInstance();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Tab " + (position + 1);
        }
    }
}
