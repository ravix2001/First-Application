package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ResourceBundle;

public class MainActivity4 extends AppCompatActivity {

    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);

        Intent i = getIntent();
        String fName = i.getStringExtra("f_name");
        String lName = i.getStringExtra("l_name");
        String email = i.getStringExtra("em");
        String phone = i.getStringExtra("ph_no");
        String address = i.getStringExtra("add");

        textView6.setText(String.format("%s %s", fName, lName));
        textView7.setText(email);
        textView8.setText(phone);
        textView9.setText(address);
    }
}