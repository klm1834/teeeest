package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class DetailActivity extends Activity {

    String items[] = {"중요도", "1", "2", "3", "4", "5"};
    ArrayAdapter<String> list;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        list = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, items);
        spinner = (Spinner) findViewById(R.id.importance_spinner);
        spinner.setAdapter(list);
        spinner.setSelection(0);
        //spinner.setOnItemSelectedListener(this);


    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        finish();

    }
}
