package com.example.roman.romanpset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReadStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_story);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        TextView story = (TextView) findViewById(R.id.storyview);
        story.setText(text);
    }
}
