package com.example.musicshopjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    Spinner spinner2;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner2 = findViewById(R.id.spinner2);
        spinnerArrayList = new ArrayList();

        spinnerArrayList.add("guitar");
        spinnerArrayList.add("drunms");
        spinnerArrayList.add("keyboard");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(spinnerAdapter);

    }

    public void increaseQuantity(View view) {
        quantity = quantity+1;
        TextView QuantityView = findViewById(R.id.textZero);
        QuantityView.setText("" + quantity);
            }
    public void decreaseQuantity(View view) {
        quantity = quantity-1;
        if (quantity<0) {
            quantity=0;
        }

        TextView QuantityView = findViewById(R.id.textZero);
        QuantityView.setText("" + quantity);
    }
}