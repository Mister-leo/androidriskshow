package com.leo.androidriskshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsecureLogActivity extends AppCompatActivity  {

    private Button backBtn;
    private Button submitBtn;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insecure_log);
        init();
    }

    private void init(){
        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsecureLogActivity.this.finish();
            }
        });
        submitBtn = findViewById(R.id.insecure_submit_btn);

        editText = findViewById(R.id.insecure_edit_text);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("AndroidRiskShow", String.valueOf(editText.getText()));
            }
        });
    }


}
