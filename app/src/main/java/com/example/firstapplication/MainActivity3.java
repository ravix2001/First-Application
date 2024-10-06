package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    private Button button5;
    private Button submitButton;
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText phone;
    private EditText address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        firstName = findViewById(R.id.editTextText);
        lastName = findViewById(R.id.editTextText2);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
        address = findViewById(R.id.editTextTextPostalAddress);

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Returning to home page", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        submitButton = findViewById(R.id.button6);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);*/

                String fn = firstName.getText().toString();
                String ln = lastName.getText().toString();
                String e = email.getText().toString();
                String ph = phone.getText().toString();
                String a = address.getText().toString();

                Intent i = new Intent(MainActivity3.this, MainActivity4.class);
                i.putExtra("f_name",fn);
                i.putExtra("l_name",ln);
                i.putExtra("em",e);
                i.putExtra("ph_no",ph);
                i.putExtra("add",a);

                startActivity(i);
            }
        });
    }
}