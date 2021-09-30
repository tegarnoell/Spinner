package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    //declare spinner
    private Spinner idlicense,blood,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //declare findview
        idlicense = findViewById(R.id.idlicense);
        blood = findViewById(R.id.blood);
        gender = findViewById(R.id.gender);

        //list idlicense
        final List<String> categories = new ArrayList<String>();
        categories.add("Social Security ID");
        categories.add("Driving License");
        categories.add("Passport");

        //list blood
        final List<String> categori = new ArrayList<String>();
        categori.add("A");
        categori.add("B");
        categori.add("AB");
        categori.add("O");

        //list gender
        final List<String> cate = new ArrayList<String>();
        cate.add("Male");
        cate.add("Female");

        
        //spinner for idlicense
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        idlicense.setAdapter(dataAdapter);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        idlicense.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected: " + categories.get(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //spinner blood
        ArrayAdapter<String> data2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categori);
        blood.setAdapter(data2);
        data2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        blood.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected: " + categori.get(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //spinner gender
        ArrayAdapter<String> data = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cate);
        gender.setAdapter(data);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected: " + cate.get(position), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}