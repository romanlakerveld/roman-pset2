package com.example.roman.romanpset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_story);
    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent(this, MakeStory.class);
        switch (view.getId()) {
            case R.id.simple:
                intent.putExtra("story", "madlib0_")
        startActivity(intent);



        }

    }
}
