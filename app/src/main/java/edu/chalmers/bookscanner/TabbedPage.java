package edu.chalmers.bookscanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TabbedPage extends AppCompatActivity {
    private static final String TAG="TabbedPage";
    private  TabsPagerAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbed_activity);
        Log.d(TAG, "onCreate:Starting");

        mSectionsPageAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        mViewPager= (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);


        TabLayout tabLayout =(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        TabsPagerAdapter adapter= new TabsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Book");
        adapter.addFragment(new SecondFragment(), "Movie");
        viewPager.setAdapter(adapter);

    }

}
