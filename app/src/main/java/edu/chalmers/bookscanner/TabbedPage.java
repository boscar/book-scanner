package edu.chalmers.bookscanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

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

        setCustomTitleTypeface();
        hideStatusBar();

        TabLayout tabLayout =(TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        TabsPagerAdapter adapter= new TabsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Book");
        adapter.addFragment(new SecondFragment(), "Movie");
        viewPager.setAdapter(adapter);

    }

    private void setCustomTitleTypeface(){
        SpannableString s = new SpannableString("Information");
        s.setSpan(new TypefaceSpan(this, "Montserrat-Medium.ttf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(s);
    }

    private void hideStatusBar(){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
    }

}
