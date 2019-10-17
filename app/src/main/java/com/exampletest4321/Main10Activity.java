package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.exampletest4321.fragment.OneFragment;
import com.exampletest4321.fragment.ThreeFragment;

public class Main10Activity extends AppCompatActivity {

    private OneFragment oneFragment;

    private ThreeFragment threeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        oneFragment = new OneFragment();
        threeFragment = ThreeFragment.newInstance("","TEST_2");

        getSupportFragmentManager().beginTransaction().add(R.id.constraintLayout, threeFragment).commitAllowingStateLoss();

    }
}
