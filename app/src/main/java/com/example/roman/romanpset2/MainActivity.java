package com.example.roman.romanpset2;

import android.content.Intent;
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
        Intent intent = new Intent(this, ChooseStory.class);
        startActivity(intent);
        finish();
    }

}
