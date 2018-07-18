package com.example.alice.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends Activity {

    private CheckBox chUrl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.chUrl4 = (CheckBox) findViewById(R.id.cbUr4);
        this.chUrl4.setChecked(true);
        this.chUrl4.setText("默认选择其他成员");
    }
}
