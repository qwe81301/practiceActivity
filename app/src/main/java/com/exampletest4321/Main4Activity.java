package com.exampletest4321;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Main4Activity.this, Main2Activity.class);

//                String str = mEditText.getText().toString();
//                double number = Double.parseDouble(str);
//
//                intent.putExtra("name", "testName");// key value 形式
//                intent.putExtra("hours", number);// key value 形式

//                Person person = new Person("persName", 20);
//
//                intent.putExtra("person", person);

                //double d= Double.parseDouble(yourString);

                startActivity(intent);


            }
        });

    }
}
