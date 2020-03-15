package com.leo.androidriskshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExportedActivity extends AppCompatActivity {
    private Button backBtn;
    private TextView vulText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exported);

        init();
    }


    private void init(){
        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExportedActivity.this.finish();
            }
        });
        vulText = findViewById(R.id.exported_activity_vul_text);
        String name = getIntent().getStringExtra("name");
        vulText.setText("Hello "+ name);
    }
}
