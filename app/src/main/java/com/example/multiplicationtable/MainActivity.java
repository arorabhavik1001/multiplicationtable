package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextNumber);
        Button button = findViewById(R.id.button);
        TextView textView1 = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int num = Integer.parseInt(s);
                for(int i = 1; i<=10; i++){
                    int product = num * i;
                    textView1.append(num + " x " + i + " = " + product + "\n");
                }
            }
        });
    }
}