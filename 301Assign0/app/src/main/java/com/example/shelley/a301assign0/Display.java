package com.example.shelley.a301assign0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Shelley on 2016-09-13.
 */
public class Display extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("ccid");

        TextView tv = (TextView) findViewById(R.id.ccid);
        tv.setText(username);
    }
}
