package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void createOrder(View view) {
        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);
        TextView t = findViewById(R.id.textView6);
        EditText e1 = findViewById(R.id.name);
        EditText e2 = findViewById(R.id.phone);
        EditText e3 = findViewById(R.id.address);
        t.setText("Name: " + e1.getText() + ", phone: " + e2.getText() + ", address: " + e3.getText());
        pb.setVisibility(ProgressBar.VISIBLE);
        new CreateOrderAsync(t).execute();
        pb.setVisibility(ProgressBar.INVISIBLE);
    }
}
