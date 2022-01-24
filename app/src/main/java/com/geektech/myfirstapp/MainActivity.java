package com.geektech.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText ed1, ed2;
    private String password;
    private String email;
    private TextView textView4, textView, text3, text, textView3;
    private androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        password = "admin";
        email = "admin@gmail.com";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text3 = findViewById(R.id.text3);
        textView = findViewById(R.id.textView);
        textView4 = findViewById(R.id.textView4);
        textView3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        constraintLayout = findViewById(R.id.container1);
        ed2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed2.getText().toString().equals(password)){
                    constraintLayout.setVisibility(View.GONE);
                }
                else {
                    Toast.makeText(MainActivity.this, "ne tot parol ili login", Toast.LENGTH_SHORT).show(); }
            }
        });

    }
}