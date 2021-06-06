package com.example.admin_gestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Seances extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seances);



        tabLayout = (TabLayout) findViewById(R.id.tablyout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Add fragments here
        adapter.AddFragment(new FragmentAllSeance(),"");
        adapter.AddFragment(new FragmentSearchSeance(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_assignment_turned_in_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_search_24);
    }
}