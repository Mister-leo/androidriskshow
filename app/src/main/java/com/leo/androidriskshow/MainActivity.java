package com.leo.androidriskshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button insecureLogBtn;
    private Button exportedActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init(){
        insecureLogBtn = findViewById(R.id.insecure_logcat_btn);
        insecureLogBtn.setOnClickListener(this);
        exportedActivityBtn = findViewById(R.id.exported_activity_btn);
        exportedActivityBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.insecure_logcat_btn:
                clickInsecureLogcatButton(v);
                break;
            case R.id.exported_activity_btn:
                clickExportedActivity(v);
                break;
        }
    }

    private void clickInsecureLogcatButton(View v){
        Intent intent =new Intent(this,InsecureLogActivity.class);
        startActivity(intent);
    }

    private void clickExportedActivity(View v) {
        Intent intent = new Intent(this,ExportedActivity.class);
        intent.putExtra("name","leo");
        //intent.setAction("com.leo.action.SAYHELLO");
        startActivity(intent);

    }

}
