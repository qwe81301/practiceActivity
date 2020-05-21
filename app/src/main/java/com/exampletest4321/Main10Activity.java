package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.exampletest4321.fragment.OneFragment;
import com.exampletest4321.fragment.ThreeFragment;
import com.exampletest4321.fragment.TwoFragment;

public class Main10Activity extends AppCompatActivity {

    private OneFragment oneFragment;
    private TwoFragment twoFragment;
    private ThreeFragment threeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

//        oneFragment = new OneFragment();
//        (dem 1)
        twoFragment = TwoFragment.newInstance("", "bear1");

        //(dem 2)
//        twoFragment = new TwoFragment();
//
//        Bundle bundle = new Bundle();
//        bundle.putString("TestName", "bear2");
////        bundle.putInt();
//        twoFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction().add(R.id.constraintLayout, twoFragment, "two").addToBackStack(null)
                .commitAllowingStateLoss();

    }
}
