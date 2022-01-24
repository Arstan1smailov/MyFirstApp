package com.geektech.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText ed1, ed2;
    private String password;
    private String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        password = "admin";
        email = "admin@gmail.com";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "aaa",Toast.LENGTH_SHORT).show();
            }
        });
    }
}