package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class Main1 extends AppCompatActivity {

    Button food, phone, webList;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        food= findViewById(R.id.button);
        webList = findViewById(R.id.web);
        input = findViewById(R.id.editText);
    }

    void Click(View v){
        String a = input.getText().toString();
        Intent i = new Intent(this, ListActivity.class);
        i.putExtra("VALUE", a);

        startActivity(i);
    }

//    void phoneClick(View v){
//        String a = input.getText().toString();
//        Intent i = new Intent(this, ListActivity.class);
//        i.putExtra("VALUE", a);
//
//        startActivity(i);
//    }

    void webClick(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
//       Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
//        emailIntent.setData(Uri.parse("mailto:email@gmail.com"));
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "subject");
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "text");
//        startActivity(emailIntent);
    }
}
