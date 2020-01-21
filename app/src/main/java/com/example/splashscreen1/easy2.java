package com.example.splashscreen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class easy2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy2);
    }

    public void ans1(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void ans2(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void ans3(View view) {
        Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_LONG).show();
    }

    public void ans4(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void answ1(View view) {
        Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_LONG).show();
    }

    public void answ2(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void answ3(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void answ4(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void next1(View view) {
        Intent intent= new Intent(easy2.this,easy3.class);
        startActivity(intent);
    }
}
