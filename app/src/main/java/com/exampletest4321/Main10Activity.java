package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.exampletest4321.fragment.OneFragment;

public class Main10Activity extends AppCompatActivity {

    private OneFragment oneFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        oneFragment = new OneFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.constraintLayout, oneFragment).commitAllowingStateLoss();

    }
}
