package com.abulkalam.view_stub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ViewStub simpleViewStub;
    Button showBtn, hideBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the reference of the Buttons & ViewStub
        showBtn = findViewById(R.id.showBtn);
        hideBtn = findViewById(R.id.hideBtn);
        simpleViewStub = findViewById(R.id.simple_viewStub);

        //inflate the viewStub
        simpleViewStub.inflate();

        //perform click event on showBtn click
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleViewStub.setVisibility(View.VISIBLE);
            }
        });

        //perform click event on hideBtn click
        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set GONE visibility of ViewStub
                simpleViewStub.setVisibility(View.GONE);
            }
        });

    }
}