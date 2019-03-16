package com.example.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Tv1;
    private TextView Tv2;
    private TextView Tv3;
    private LinearLayout Ll2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv1=findViewById(R.id.tv1);
        Tv2=findViewById(R.id.tv2);
        Tv3=findViewById(R.id.tv3);
        Ll2=findViewById(R.id.Ll2);

        Tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
