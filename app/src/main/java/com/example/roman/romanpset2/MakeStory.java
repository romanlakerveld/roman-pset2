package com.example.roman.romanpset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.IOException;

public class MakeStory extends AppCompatActivity {

    private Story newstory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_story);

        Intent intent = getIntent();
        String story = intent.getStringExtra("story");
        Log.d("CREATION", story);
        try {
            newstory = new  Story(getAssets().open(story));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String test = newstory.toString();
        Log.d("CREATION", test);


    }
    public void onButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        newstory.fillInPlaceholder(editText.getText().toString());

        if (newstory.isFilledIn()) {
            Intent intent = new Intent(this, ReadStory.class);
            intent.putExtra("text", newstory.toString());
            startActivity(intent);
            finish();
        }

    }
}
