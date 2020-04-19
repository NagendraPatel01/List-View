package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    String[] list= {"Ankit","Bhupendra","Bhupendra","Bhupendra","Bhupendra","Bhupendra","Bhupendra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listview.setAdapter(arrayAdapter);
    }
}
