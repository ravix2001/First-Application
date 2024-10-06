package com.example.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private TextView textView4;
    private Button button2;
    private Button button4;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumberDecimal);
        textView4 = findViewById(R.id.textView4);

        Log.d("General","App working properly");

        button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){

               Toast.makeText(MainActivity.this, "Converted", Toast.LENGTH_SHORT).show();

               String s = editText.getText().toString();
               int value = Integer.parseInt(s);
               double result = 2.54 * value;
               textView4.setText("" + result);

               Log.d("General","Convert Button working properly");
           }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Moving onto second page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);

                Log.d("General","Second Button working properly");
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Moving onto third page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);

                Log.d("General","Third Button working properly");
            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Moving onto fifth page", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(i);

                Log.d("General","Fifth Button working properly");
            }
        });
    }
}