package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private String TAG_LOG = "Main 2 Activity";

    private TextView mTextView;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


//        Intent intent = this.getIntent();
//        //取得傳遞過來的資料
////        String name = intent.getStringExtra("name");
////        double hours = intent.getDoubleExtra("hours",0);
//
//        //取用object
//        Person person = (Person) intent.getSerializableExtra("person");
//
//
//        mTextView = findViewById(R.id.textView2);
//        mTextView.setText("person name:"+person.getName()+" person age:"+person.getAge());


        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //送出廣播
//                Intent intent = new Intent("test_Broadcast"); //設定廣播識別碼
//                intent.putExtra("testValue", "OK 收到廣播");
//                sendBroadcast(intent); //發送廣播訊息

                /*
                 * 调用setResult方法表示我将Intent对象返回给之前的那个Activity，这样就可以在onActivityResult方法中得到Intent对象，
                 */
                Intent intent2 = new Intent(); //設定廣播識別碼
                intent2.putExtra("testsetResult", "TEST setResult");
                setResult(44, intent2);//需要自訂一個 resultCode
                finish();//(這邊一定要在加上 finish() )  todo finish() 方法是關閉這個activity
            }
        });



    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG_LOG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG_LOG,"onStart");


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG_LOG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG_LOG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG_LOG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG_LOG,"onDestroy");
    }
}
