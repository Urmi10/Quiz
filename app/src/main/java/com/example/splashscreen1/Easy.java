package com.example.splashscreen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Easy extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        r1=(RadioButton)findViewById(R.id.r1);
    r2=(RadioButton)findViewById(R.id.r2);
    r3=(RadioButton)findViewById(R.id.r3);
    r4=(RadioButton)findViewById(R.id.r4);
    }

    public void mes(View view)
    {

            Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_LONG).show();

        }

    public void mess(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void messa(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void messag(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void message(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void view(View view) {

        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void txt(View view) {
        Toast.makeText(getApplicationContext(),"Incorrect",Toast.LENGTH_LONG).show();
    }

    public void text(View view) {
        Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_LONG).show();
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

    public void next(View view) {
        Intent intent= new Intent(Easy.this,easy2.class);
        startActivity(intent);
    }

    public void submit3(View view) {
        Intent intent = new Intent(Easy.this, Submit.class);
        startActivity(intent);
        finish();
    }
}