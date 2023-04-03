package com.example.basic_android_studio_introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText (View v){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        Log.d("input_info", input);
        ((TextView) findViewById(R.id.output)).setText(input);

        Toast.makeText(this, input, Toast.LENGTH_LONG   ).show();
    }

    public void disable(View v){
        /*
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled");
        Log.d("sucess", "Button disabled");
        */
        /*
        Button myview = findViewById(R.id.button);
        myview.setEnabled(false);
        Button b1 = (Button) myview;
        b1.setText("Hello");
        */
        findViewById(R.id.button).setEnabled(false);
        ((Button) findViewById(R.id.button)).setText("No variable");

    }
}