package com.tasneembohra.preferencefragmentapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Display the fragment as the main content.
        android.app.FragmentManager mFragmentManager = getFragmentManager();
        android.app.FragmentTransaction mFragmentTransaction = mFragmentManager
                .beginTransaction();
        SettingFragment mPrefsFragment = new SettingFragment();
        mFragmentTransaction.replace(android.R.id.content, mPrefsFragment);
        mFragmentTransaction.commit();
    }
}
