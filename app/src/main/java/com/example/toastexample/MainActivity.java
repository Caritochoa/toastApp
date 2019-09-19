package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    protected Button myButton;
    String myString = "Este es un mensaje Toast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void BasicToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "This is a Toast MSN";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context, text, duration);
        toast.show();
    }





}
