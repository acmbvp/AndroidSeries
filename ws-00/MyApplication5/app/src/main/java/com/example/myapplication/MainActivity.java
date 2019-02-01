package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button add;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editText);
        number2 = findViewById(R.id.editText2);
        add = findViewById(R.id.button);
        show = findViewById(R.id.textView);

    }

    public  void clickMe(View v){
        String a = number1.getText().toString();
        int num = Integer.parseInt(a);
        String b = number2.getText().toString();
        int num2 = Integer.parseInt(b);
        show.setText("RESULT:" + (num+num2));
    }
}
