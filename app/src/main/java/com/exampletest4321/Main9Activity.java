package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.exampletest4321.fragment.AFragment;
import com.exampletest4321.fragment.BFragment;
import com.exampletest4321.fragment.MainFragment;

public class Main9Activity extends AppCompatActivity
        implements MainFragment.OnFragmentInteractionListener,
        AFragment.OnFragmentInteractionListener,
        BFragment.OnFragmentInteractionListener {

    private MainFragment mMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        mMainFragment = new MainFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, mMainFragment).commitAllowingStateLoss();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
