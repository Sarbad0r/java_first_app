package com.example.app_learning_with_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int number_count = 0;
    private TextView textView;
    private Button getButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("called on create");
        setContentView(R.layout.activity_main);

        getButton = findViewById(R.id.button_first);
        textView = findViewById(R.id.count_show);
        textView.setText(String.valueOf(number_count));
    }

    @Override
    protected void onStart() {
        System.out.println("called on start");
        super.onStart();

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_count = number_count + 1;
                System.out.println("number: " + number_count);
                textView.setText(String.valueOf(number_count));
            }
        });
    }

    @Override
    protected void onResume() {
        System.out.println("called on start");
        super.onResume();
    }
}