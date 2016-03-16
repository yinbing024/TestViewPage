package com.test.yinbing.testviewpage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.test.yinbing.testviewpage.adapter.FragmentAdapter;

public class MainActivity extends FragmentActivity {

    private ViewPager test_vp;
    private FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        test_vp = (ViewPager) findViewById(R.id.test_vp);
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),null);
        test_vp.setAdapter(fragmentAdapter);
        test_vp.addOnPageChangeListener(new TabPagerOnListener());
    }

    public class TabPagerOnListener implements ViewPager.OnPageChangeListener{

        //当前页面被滑动时调用
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            System.out.println("当前页面被滑动时调用");
        }
        //当新的页面被选中时调用
        @Override
        public void onPageSelected(int position) {
            System.out.println("当新的页面被选中时调用");
        }
        //当滑动状态改变时调用
        @Override
        public void onPageScrollStateChanged(int state) {
            System.out.println("当滑动状态改变时调用");
        }
    }

}
