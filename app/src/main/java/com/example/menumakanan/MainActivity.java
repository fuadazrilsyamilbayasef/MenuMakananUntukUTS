package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Spinner combo;

    public String Menu_Makanan [] = {"Nasi Goreng Ayam", "Nasi Goreng Kambing", "Nasi Goreng Teri", "Nasi Goreng Spesial"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listMakanan);
        combo = (Spinner) findViewById(R.id.comboMakanan);

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Menu_Makanan);

        listView.setAdapter(adapter);

        combo.setAdapter(adapter);
    }
}