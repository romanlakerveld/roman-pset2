package com.example.roman.romanpset2;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

public class MakeStory extends AppCompatActivity {

    private Story newstory;
    private TextView textView1;
    private TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_story);

        if (savedInstanceState != null) {
            newstory = (Story) savedInstanceState.getSerializable("story");

        }
        else {
            Intent intent = getIntent();
            String story = intent.getStringExtra("story");
            Log.d("CREATION", story);
            try {
                newstory = new Story(getAssets().open(story));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        textView1 = findViewById(R.id.textView1);
        textView1.setText("Please type a " + newstory.getNextPlaceholder() + " in the field below.");

        textview2 = findViewById(R.id.textView2);
        textview2.setText("Remaining words to fill in: " + newstory.getPlaceholderRemainingCount());



    }
    public void onButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        newstory.fillInPlaceholder(editText.getText().toString());
        editText.setText("");

        if (newstory.isFilledIn()) {
            Intent intent = new Intent(this, ReadStory.class);
            intent.putExtra("text", newstory.toString());
            startActivity(intent);
            finish();
        }

        textView1.setText("Please type a " + newstory.getNextPlaceholder() + "in the field below.");
        textview2.setText("Remaining words to fill in: " + newstory.getPlaceholderRemainingCount());

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("story", newstory);
    }
}
