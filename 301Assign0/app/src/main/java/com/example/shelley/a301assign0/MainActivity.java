package com.example.shelley.a301assign0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){

        if( v.getId() == R.id.enterButton){

            EditText a = (EditText) findViewById(R.id.editCCID);
            String str = a.getText().toString();
            Intent i = new Intent(MainActivity.this, Display.class);
            i.putExtra("ccid", str);
            startActivity(i);
        }
    }
}
