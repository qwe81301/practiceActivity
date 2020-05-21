package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Main11Activity extends AppCompatActivity {

    private Switch mSwitch2;
    private Switch mSwitch3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        mSwitch2 = findViewById(R.id.switch2);
        mSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.getId() == R.id.switch2) {

                    Log.v("TEST", "switch2");

                    //監聽 Switch 是否改變 不管是點擊ConstraintLayout區塊 或是 直接點擊Switch 觸發
//                    if (isChecked) {
//                        writeSystemSetting("totalNotificationSetting", true);
//                        //推播總開關 開啟時執行
//                        totalNotificationSettingSwitchOn();
//                    } else {
//                        writeSystemSetting("totalNotificationSetting", false);
//                        //推播總開關 關閉時執行
//                        totalNotificationSettingSwitchOff();
//                    }
                }
            }
        });

        mSwitch3 = findViewById(R.id.switch3);
        mSwitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.getId() == R.id.switch3) {

                    Log.v("TEST", "switch3");

                    //監聽 Switch 是否改變 不管是點擊ConstraintLayout區塊 或是 直接點擊Switch 觸發
//                    if (isChecked) {
//                        writeSystemSetting("totalNotificationSetting", true);
//                        //推播總開關 開啟時執行
//                        totalNotificationSettingSwitchOn();
//                    } else {
//                        writeSystemSetting("totalNotificationSetting", false);
//                        //推播總開關 關閉時執行
//                        totalNotificationSettingSwitchOff();
//                    }
                }
            }
        });

    }
}
