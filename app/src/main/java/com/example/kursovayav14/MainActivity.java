package com.example.kursovayav14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;
    private EditText textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listItem);
        String[] items = {"12", "258", "2589", "224"};
        arrayList=new ArrayList<>(Arrays.asList(items));
        arrayAdapter=new ArrayAdapter<String>(this,R.layout.list_item,R.id.textItem,arrayList);
        listView.setAdapter(arrayAdapter);
        textInput=findViewById(R.id.textInput);
        Button btn = findViewById(R.id.btnAdd);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newItem = textInput.getText().toString();
                arrayList.add(newItem);
                arrayAdapter.notifyDataSetChanged();
            }
        });

    }
}