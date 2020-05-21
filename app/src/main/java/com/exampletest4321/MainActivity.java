package com.exampletest4321;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    //todo(0)todo  註解 後加上 todo 之後 AS 會自動判定後 高亮 提示 (常用兩種預設)

    //(1) 初始元件宣告區
    private Switch mSwitch;
    private TextView mTextView;
    private Button mButton;
    private Button mGetIMEIButton;

    private EditText mEditText;

    private final String strTest = "qwe";

    //全域宣告 廣播 Receiver
    private MainActivityReceiver mMainActivityReceiver;

    //todo(2) LOG功能 (這裡 常數類的用大寫加 "_" 命名 EX:TAG_LOG) 常用 class 名稱
    private String TAG_LOG = "MainActivity";

    //(3) logcat功能(AS下方工具欄)

    //todo(4) GSON
    DataBean3 dataBean;


    private TextView mDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG_LOG, "onCreate" + BuildConfig.VERSION_NAME);

        mDateTextView =  findViewById(R.id.textView_date);

        // findViewById UI  要比使用元件還早 (要不然會報錯)
        mSwitch = findViewById(R.id.switch123);
        mTextView = findViewById(R.id.textView);//UI 宣告 (跟APP講 誰是R.id.textView)  會自動連結　R.layout.activity_main　下面的id
        mButton = findViewById(R.id.button);
        mGetIMEIButton = findViewById(R.id.button2);

        //todo() 新增 EditText
        mEditText = findViewById(R.id.editText); //todo() 改成 android:inputType="numberPassword"


        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });


        mGetIMEIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String imei = getIMEI();

                Log.v(TAG_LOG, "IMEI: " + imei);
                Log.v(TAG_LOG, "BuildConfig: " + BuildConfig.VERSION_NAME);




            }
        });


        //新增一個監聽器 裡面用callback 實做
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {//todo() 左邊小綠點 跳轉連結 到原方法(主要我們是看這參數功能說明)
                Log.v(TAG_LOG, "test show log(mSwitch onCheckedChanged)");

                //todo() 判斷 當下isChecked 來做反應

                GradientDrawable TextViewDrawable = (GradientDrawable) mDateTextView.getBackground();

                if (isChecked) {
                    //todo() 呼叫其他方法
                    testFunc("open");

                    TextViewDrawable.setShape(GradientDrawable.OVAL);
                    TextViewDrawable.setColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                    TextViewDrawable.setStroke(5,ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                    mDateTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));

                } else {
                    testFunc("close");

                    TextViewDrawable.setShape(GradientDrawable.OVAL);
                    TextViewDrawable.setColor(ContextCompat.getColor(getApplicationContext(), R.color.transparent));
                    TextViewDrawable.setStroke(5,ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));

                    mDateTextView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                }
            }
        });


        // GSON
        //假設回傳拿到 json 字串 responseStr  json 字串
        String responseStr = "{\n" +
                "   \"rid\":1,\n" +
                "   \"sDate\":\"2020\\/07\\/30\",\n" +
                "   \"eDate\":\"2020\\/08\\/03\",\n" +
                "   \"date\":{\n" +
                "      \"2020\\/07\\/30\":{\n" +
                "         \"myScj\":{\n" +
                "            \"ctm27\":[\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試石\",\n" +
                "                  \"sNo\":3438\n" +
                "               },\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試蕉\",\n" +
                "                  \"sNo\":3435\n" +
                "               }\n" +
                "            ]\n" +
                "         },\n" +
                "         \"other\":{\n" +
                "            \"leave\":[\n" +
                "               {\n" +
                "                  \"cName\":\"石晉宇A\",\n" +
                "                  \"sNo\":3211\n" +
                "               }\n" +
                "            ]\n" +
                "         }\n" +
                "      },\n" +
                "      \"2020\\/07\\/31\":{\n" +
                "         \"myScj\":{\n" +
                "\n" +
                "         },\n" +
                "         \"other\":{\n" +
                "\n" +
                "         }\n" +
                "      },\n" +
                "      \"2020\\/08\\/01\":{\n" +
                "         \"myScj\":{\n" +
                "\n" +
                "         },\n" +
                "         \"other\":{\n" +
                "            \"leave\":[\n" +
                "               {\n" +
                "                  \"cName\":\"石晉宇A\",\n" +
                "                  \"sNo\":3211\n" +
                "               }\n" +
                "            ]\n" +
                "         }\n" +
                "      },\n" +
                "      \"2020\\/08\\/02\":{\n" +
                "         \"myScj\":{\n" +
                "            \"ck44\":[\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試石\",\n" +
                "                  \"sNo\":3438\n" +
                "               }\n" +
                "            ]\n" +
                "         },\n" +
                "         \"other\":{\n" +
                "            \"ck7\":[\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試豪\",\n" +
                "                  \"sNo\":3437\n" +
                "               },\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試蕉\",\n" +
                "                  \"sNo\":3435\n" +
                "               }\n" +
                "            ],\n" +
                "            \"leave\":[\n" +
                "               {\n" +
                "                  \"cName\":\"石晉宇A\",\n" +
                "                  \"sNo\":3211\n" +
                "               }\n" +
                "            ]\n" +
                "         }\n" +
                "      },\n" +
                "      \"2020\\/08\\/03\":{\n" +
                "         \"myScj\":{\n" +
                "            \"ck7\":[\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試石\",\n" +
                "                  \"sNo\":3438\n" +
                "               }\n" +
                "            ]\n" +
                "         },\n" +
                "         \"other\":{\n" +
                "            \"ck44\":[\n" +
                "               {\n" +
                "                  \"cName\":\"APP測試蕉\",\n" +
                "                  \"sNo\":3435\n" +
                "               }\n" +
                "            ]\n" +
                "         }\n" +
                "      }\n" +
                "   },\n" +
                "   \"classList\":{\n" +
                "      \"ck44\":{\n" +
                "         \"color\":\"#3278f0\",\n" +
                "         \"data\":\"【08:30~12:00】+【18:06~次日03:30】+【次日05:00~次日06:00】,【12:00~13:30】+【次日04:00~次日04:30】,13小時54分鐘\",\n" +
                "         \"name\":\"APP_班別_次日_\"\n" +
                "      },\n" +
                "      \"ck7\":{\n" +
                "         \"color\":\"#4c7fb9\",\n" +
                "         \"data\":\"【09:00~12:00】+【14:00~16:00】+【17:00~18:00】,無,6小時\",\n" +
                "         \"name\":\"變動三段\"\n" +
                "      },\n" +
                "      \"ctm22\":{\n" +
                "         \"color\":\"#5cab7d\",\n" +
                "         \"data\":\"【00:00~01:00】,無,1小時\",\n" +
                "         \"name\":\"5222\"\n" +
                "      },\n" +
                "      \"ctm27\":{\n" +
                "         \"color\":\"#5cab7d\",\n" +
                "         \"data\":\"【00:01~00:02】,無,0小時1分鐘\",\n" +
                "         \"name\":\"5999自訂\"\n" +
                "      },\n" +
                "      \"leave\":{\n" +
                "         \"color\":\"#f2807c\",\n" +
                "         \"data\":\"\",\n" +
                "         \"name\":\"休假\"\n" +
                "      }\n" +
                "   },\n" +
                "   \"name\":\"APP TEST 03\",\n" +
                "   \"intro\":\"TEST APP for 排班123TEST APP for 排班123TEST APP for 排\"\n" +
                "}";

        Gson gson = new Gson();

        dataBean = gson.fromJson(responseStr, DataBean3.class);

        Log.v("TAG","");
//        switch (dataBean.getRid()) {
//            case 1:
//                Log.v(TAG_LOG, "成功");
//                // 成功後要執行甚麼方法...
//
//                // debug 中斷模式  在裡面一層的參數  EX: 5.2  做切割  [0] [1]都能直接看值是多少
//                String str = String.valueOf(dataBean.getHours()).split("\\.")[0];
//                Log.v(TAG_LOG, "str:" + str);
//
//                break;
//            case -1:
//                Log.v(TAG_LOG, "失敗");
//                break;
//        }


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);

//                String str = mEditText.getText().toString();
//                double number = Double.parseDouble(str);
//
//                intent.putExtra("name", "testName");// key value 形式
//                intent.putExtra("hours", number);// key value 形式

                Person person = new Person("persName", 20);

                intent.putExtra("person", person);

                //double d= Double.parseDouble(yourString);

//                startActivity(intent);
                //todo 一次看看  finish() 會關閉當前的Activity
                // close this activity
//                finish();


                startActivityForResult(intent,  33);//需要自訂一個 requestCode


            }
        });


        //todo 四大元件之一廣播   廣播分兩種 動態廣播 跟 靜態廣播  差別在於 註冊寫法
        //靜態廣播 寫法 8.0 版本之後官方也不建議使用了 所以這邊我就不說寫法 原本我也沒甚麼用到
        //下面是用 動態廣播來舉例


        //todo 新增廣播過濾器
        IntentFilter customIntentFilter = new IntentFilter();
        //todo 新增過濾器的標籤 在廣播這邊叫做 Action
        customIntentFilter.addAction("test_Broadcast");
        customIntentFilter.addAction("test_Broadcast2");
        //todo 這邊 先用全域宣告 因為等等還要註銷
        mMainActivityReceiver = new MainActivityReceiver();
        //todo 註冊廣播接收器
        registerReceiver(mMainActivityReceiver, customIntentFilter);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 33 && resultCode == 44)
        {
            String result_value = data.getStringExtra("testsetResult");
            mTextView.setText("已成功回傳");

        }
    }

    //    @SuppressLint("MissingPermission")
//    @TargetApi(Build.VERSION_CODES.M)
//    public String getIMEI() {
//        // todo(提醒) 要記得加上 允許權限(和檢查手機是否)
//        TelephonyManager tm = (TelephonyManager) getSystemService(Activity.TELEPHONY_SERVICE);
//        if (tm != null) {
//            Log.v("getLine1Number", "getLine1Number: " + tm.getSimSerialNumber());
//
//            if (checkSelfPermission(Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                new AlertDialog.Builder(MainActivity.this)
//                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                            }
//                        })
//                        .setCancelable(false)
//                        .setMessage("未允許電話相關權限，將使「" + getString(R.string.app_name) + "」無法正常運作，請至設定開啟相關權限")
//                        .show();
//            }
//            return tm.getDeviceId();
//        }
//        return null;
//    }

    @SuppressLint("MissingPermission")
    public String getIMEI() {
        // todo(提醒) 要記得加上 允許權限 並打開全線
        TelephonyManager tm = (TelephonyManager) getSystemService(Activity.TELEPHONY_SERVICE);
        if (tm != null) {
            Log.v("getLine1Number", "getLine1Number: " + tm.getSimSerialNumber());

//            if (checkSelfPermission(Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//                new AlertDialog.Builder(MainActivity.this)
//                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                            }
//                        })
//                        .setCancelable(false)
//                        .setMessage("未允許電話相關權限，將使「" + getString(R.string.app_name) + "」無法正常運作，請至設定開啟相關權限")
//                        .show();
//            }
            return tm.getDeviceId();
        }
        return null;
    }


    //todo() 生命週期
    @Override
    protected void onRestart() {
        super.onRestart();
        //直接點擊 (列表鍵)回來後執行
        Log.v(TAG_LOG, "onRestart");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG_LOG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG_LOG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG_LOG, "onPause");
        //todo　直接點擊 (列表鍵)退出執行
    }

    @Override
    protected void onStop() {
        super.onStop();
        // todo 這邊只先執行到　onStop　表示　還沒完全被殺掉
        Log.v(TAG_LOG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // todo 最後做　資源釋放　或是回收的地方　app 被 kill前會執行
        Log.v(TAG_LOG, "onDestroy");

        //註銷廣播接收器
        unregisterReceiver(mMainActivityReceiver);

    }


    //廣播接收器
    public class MainActivityReceiver extends BroadcastReceiver {
        @SuppressLint("LongLogTag")
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.v(TAG_LOG + "(BroadcastReceiver)", "intent.getAction(): " + intent.getAction());

            if ("test_Broadcast".equals(intent.getAction())) {

                if (intent.getStringExtra("testValue").equals("OK 收到廣播")) {

                    mTextView.setText("OK 收到廣播 打印出來");
                }
            }
        }
    }

    //todo()　/** 即可叫出

    /**
     * @param str
     */
    private void testFunc(String str) {

        //修改 TextView 文字
        mTextView.setText(str);

        //todo() 彈出提示
        Toast.makeText(this, "彈出文字:" + str, Toast.LENGTH_LONG).show();
    }

}
