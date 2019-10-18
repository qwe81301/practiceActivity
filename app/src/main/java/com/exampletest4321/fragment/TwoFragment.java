package com.exampletest4321.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.exampletest4321.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TwoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TwoFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button mJumpButton;
    private Button mChangeTextButton;

    private TextView mTextView;

    private ThreeFragment threeFragment;


    public TwoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TwoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TwoFragment newInstance(String param1, String param2) {
        TwoFragment fragment = new TwoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mJumpButton = view.findViewById(R.id.button6);
        mJumpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (threeFragment ==null){
                    threeFragment = ThreeFragment.newInstance("","");
                }
                //(演示 1)todo 一般跳轉
//                getFragmentManager().beginTransaction().replace(R.id.constraintLayout,threeFragment).commitAllowingStateLoss();

                //(演示 2)todo 堆疊返回(回退棧) 按返回鍵能退回 上一個fragment
                getFragmentManager().beginTransaction().replace(R.id.constraintLayout,threeFragment).addToBackStack(null).commitAllowingStateLoss();

                //(演示 3)todo 堆疊返回(回退棧) 按返回鍵能退回 後資料保存
//                getFragmentManager().beginTransaction().replace(R.id.constraintLayout,threeFragment).addToBackStack(null).commitAllowingStateLoss();

                // todo 試過 但不能用?
//                Fragment f = getFragmentManager().findFragmentByTag("2");

                //todo 能用上 addToBackStack(所帶 String 名稱) 如下所示
//                addToBackStack (FRAGMENT_NAME);
//                getFragmentMangager().findFragmentByTag(FRAGMENT_NAME);

            }
        });

        mTextView = view.findViewById(R.id.textView4);

        mChangeTextButton =view.findViewById(R.id.button7);
        mChangeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("OOOXXX");
            }
        });

    }
}
