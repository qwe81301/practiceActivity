package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Main5Activity extends AppCompatActivity {

    private EditText mEditText;
    private RadioGroup mRadioGroup;
    private ImageButton mImageButton;
    private TextView mTextView;
    private Button mButton;

    private boolean mFlag = true;

    //儲存用 登入保存資訊 解除安裝時會不見
    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mEditText = findViewById(R.id.editText2);
        mRadioGroup = findViewById(R.id.radioGroup);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton:
                        mFlag = true;
                        writeData("show",true);
                        break;
                    case R.id.radioButton2:
                        mFlag = false;
                        writeData("hide",false);
                        break;
                }
            }
        });

        mImageButton = findViewById(R.id.imageButton2);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mFlag) {
                    Toast.makeText(getApplicationContext(), mEditText.getText().toString(), Toast.LENGTH_SHORT).show();
                }

                mTextView.setText(readData("tokenData"));
            }
        });

        mTextView = findViewById(R.id.textView3);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readData("23132");
            }
        });


    }

    private void writeData(String tokenData, boolean bool) {
        mSharedPreferences = getSharedPreferences("StorageData", MODE_PRIVATE);
        mSharedPreferences.edit()
                .putString("tokenData", tokenData)
                .putBoolean("booleanData",bool);

//                mSharedPreferences.apply();//送出
    }

    private String readData(String key) {
        mSharedPreferences = getSharedPreferences("StorageData123", MODE_PRIVATE);
        return mSharedPreferences.getString(key, "");
    }

    private void deleteData() {
        mSharedPreferences = getSharedPreferences("StorageData99", MODE_PRIVATE);
        mSharedPreferences.edit().clear().apply();
    }


//    public void onCheckboxClicked(View view) {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.checkbox_meat:
//                if (checked)
//                // Put some meat on the sandwich
//            else
//                // Remove the meat
//                break;
//            case R.id.checkbox_cheese:
//                if (checked)
//                // Cheese me
//            else
//                // I'm lactose intolerant
//                break;
//            // TODO: Veggie sandwich
//        }
//    }
}
