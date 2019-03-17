package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int val1,val2;
    EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.num1);
        editText2=(EditText) findViewById(R.id.num2);

    }

    float result;
    public void addbutton(View v)
   {
       val1=Integer.parseInt(editText1.getText().toString());
       val2=Integer.parseInt(editText2.getText().toString());
       result=(val1+val2);
       TextView textView=(TextView) findViewById(R.id.ans);
       textView.setText( Float.toString(result));
   }

    public void subbutton(View v)
    {
        val1=Integer.parseInt(editText1.getText().toString());
        val2=Integer.parseInt(editText2.getText().toString());
        result=(val1-val2);
        TextView textView=(TextView) findViewById(R.id.ans);
        textView.setText( Float.toString(result));
    }

    public void mulbutton(View v)
    {
        val1=Integer.parseInt(editText1.getText().toString());
        val2=Integer.parseInt(editText2.getText().toString());
           result=(val1*val2);
           TextView textView=(TextView) findViewById(R.id.ans);
        textView.setText( Float.toString(result));
    }

    public void divbutton(View v)
    {   val1=Integer.parseInt(editText1.getText().toString());
        val2=Integer.parseInt(editText2.getText().toString());
        result=(val1/val2);
        TextView textView=(TextView) findViewById(R.id.ans);
        textView.setText( Float.toString(result));
    }


}
