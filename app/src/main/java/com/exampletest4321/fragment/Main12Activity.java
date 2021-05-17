package com.exampletest4321.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.exampletest4321.ListDataBean;
import com.exampletest4321.R;
import com.google.gson.Gson;

public class Main12Activity extends AppCompatActivity {

    private GridView gvShow;
    private String[] fruit_name = new String[]{"Apple", "Banana", "Orange", "Grape", "Strawberry"};


    private String responseStr = "{\n" +
            "   \"title\":\"喪假3日\",\n" +
            "   \"value\":\"32小時\",\n" +
            "   \"list\":[\n" +
            "      {\n" +
            "         \"sDate\":\"2019\\/03\\/05 08:30\",\n" +
            "         \"eDate\":\"2019\\/03\\/05 18:00\",\n" +
            "         \"hours\":\"8小時\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"sDate\":\"2019\\/09\\/16 00:00\",\n" +
            "         \"eDate\":\"2019\\/09\\/17 00:00\",\n" +
            "         \"hours\":\"8小時\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"sDate\":\"2019\\/09\\/17 00:00\",\n" +
            "         \"eDate\":\"2019\\/09\\/19 08:00\",\n" +
            "         \"hours\":\"8小時\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"sDate\":\"2019\\/09\\/17 00:00\",\n" +
            "         \"eDate\":\"2019\\/09\\/19 08:00\",\n" +
            "         \"hours\":\"8小時\"\n" +
            "      }\n" +
            "   ]\n" +
            "}";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        gvShow = findViewById(R.id.grid);
        list();
        setAdapter();
    }


    private void list() {
        Gson gson = new Gson();
        ListDataBean listDataBean= new ListDataBean();
        listDataBean = gson.fromJson(responseStr, ListDataBean.class);

        for (ListDataBean.ListBean listBean:listDataBean.getList()){

        }

    }

    private void setAdapter() {
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruit_name);
        gvShow.setAdapter(adapter);

    }
}
