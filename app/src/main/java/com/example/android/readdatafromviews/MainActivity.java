package com.example.android.readdatafromviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.android.readdatafromviews.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //Activity's values when the activity was previously destroyed
        super.onCreate(savedInstanceState);  //Tells Android to restore previous values
        setContentView(R.layout.activity_main);  //Puts buttons, text fields, images, etc. on activity screen
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewItem1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textViewItem1.getText().toString();
        Log.v("MainActivity", menuItem1);  //.v is verbose

        // Find second menu item TextView and print the text to the logs
        TextView textViewItem2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textViewItem2.getText().toString();
        Log.v("MainActivity", menuItem2);

        // Find third menu item TextView and print the text to the logs
        TextView textViewItem3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textViewItem3.getText().toString();
        Log.v("MainActivity", menuItem3);
    }
}