package com.example.splashscreen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msg(View view) {
        Intent intent= new Intent(MainActivity.this,Easy.class);
        startActivity(intent);
        finish();
    }

    public void medium(View view) {
        Intent intent= new Intent(MainActivity.this,medium.class);
        startActivity(intent);
        finish();
    }

    public void hard(View view) {
        Intent intent= new Intent(MainActivity.this,hard.class);
        startActivity(intent);
        finish();
    }


}

