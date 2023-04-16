package com.example.app_learning_with_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

import utils.Utils;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Button clickButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.user_field);
        clickButton = findViewById(R.id.click_button_id);
        result = findViewById(R.id.result_cloud);

    }

    @Override
    protected void onStart() {

        super.onStart();

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().trim().equals("")) {
                    Utils.checkUserField(MainActivity.this, editText.getText().toString());
                }
            }
        });
    }

    @Override
    protected void onResume() {

        super.onResume();
        System.out.println("called on resume");
    }
}