package com.example.sendbad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ListView L = (ListView) findViewById(R.id.listV);

        String [] S = getResources().getStringArray(R.array.index);

        ArrayAdapter A = new ArrayAdapter<String>(this,R.layout.row_item,R.id.txt2,S);

        L.setAdapter(A);

    }
}
