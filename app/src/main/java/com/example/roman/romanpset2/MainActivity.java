package com.example.roman.romanpset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.roman.romanpset2.Story;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToChoice(View view) {
        TextView text = findViewById(R.id.textView);
        text.setText("Rusland ist dat schones land");
    }

}
