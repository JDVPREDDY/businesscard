package com.example.android.businesscard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void message (View view){
    Toast.makeText(this,"Sorry! Menu will be updated here soon.",Toast.LENGTH_SHORT).show();
    return;
}
}
