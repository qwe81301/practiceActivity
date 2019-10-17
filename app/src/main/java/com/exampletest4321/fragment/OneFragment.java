package com.exampletest4321.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exampletest4321.R;

/**
 * author:       bearshih
 * project:      test
 * date:         2019/10/17
 * version:
 * description:
 */
public class OneFragment extends Fragment {

    public OneFragment(){

    }

    //todo 綁定畫面
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);

        return view;
    }

    //todo 緊接 onCreateView 後執行
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        view.findViewById()
    }
}
