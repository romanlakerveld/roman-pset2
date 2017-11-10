package com.example.roman.romanpset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.FileInputStream;

public class MakeStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_story);

        Intent intent = getIntent();
        String story = intent.getStringExtra("story");
        Log.d("CREATION", story);
        filepath = new FileInputStream(story);


        Story newstory = new Story(Stream stream);
        newstory.read(filepath);


    }
}
