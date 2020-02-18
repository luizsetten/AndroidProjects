package com.example.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela02 extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);

        btn = (Button) findViewById(R.id.button5);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == btn) {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
