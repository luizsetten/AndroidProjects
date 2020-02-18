package com.example.projeto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button btn,btn2;
    private TextView tx1, tx2, tx3, tx4;
    private LinearLayout layout;
    private EditText ed1, ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.layout);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        tx1 = (TextView) findViewById(R.id.text1);
        tx2 = (TextView) findViewById(R.id.textView);
        tx3 = (TextView) findViewById(R.id.textView2);
        tx4 = (TextView) findViewById(R.id.textView3);

        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View view) {
        if(view == btn){
            tx1.setText(ed1.getText());
            tx2.setText(ed2.getText());
            Button b = new Button(this);
            b.setText("Texto do novo botão");
            layout.addView(b);
        }

        if(view == btn2){
            Intent i = new Intent(this, Tela02.class);
            startActivity(i);
        }
    }
}
