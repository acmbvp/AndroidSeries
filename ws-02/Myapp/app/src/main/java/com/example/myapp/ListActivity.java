package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView = (ListView) findViewById(R.id.list);
        TextView label = findViewById(R.id.textView);
        String value= getIntent().getStringExtra("VALUE");
        label.setText(value);


        String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
                "WebOS","Ubuntu","Windows7","Max OS X"};

        String[] foodArray = {"Samosa","Pizza","Dhokla","Rolls",
                "Pasta","Croissant","Parantha","Broccoli"};

        if(value.equals("food")){
            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_text, foodArray);
            listView.setAdapter(adapter);
        }
        else if (value.equals("phone")){
            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_text, mobileArray);
            listView.setAdapter(adapter);
        }
        else{
            label.setText("Enter either 'food' or 'phone'");
        }
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String a = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(getApplicationContext(),a, Toast.LENGTH_LONG).show();
        }
    });

    }
}
