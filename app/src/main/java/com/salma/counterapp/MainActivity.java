package com.salma.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counterView;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterView=findViewById(R.id.counter_val);
        if(savedInstanceState!=null)
        {
            counter=savedInstanceState.getInt("counter");
            counter++;
            counterView.setText(String.valueOf(counter));
        }
        else{
            counterView.setText("0");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }


}
