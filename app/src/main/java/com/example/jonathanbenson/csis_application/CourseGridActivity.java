package com.example.jonathanbenson.csis_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourseGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_grid);
    }

    public void onClickBack(View view) {
        // Create intent from this activity to faculty activity
        Intent intent = new Intent(CourseGridActivity.this, MainActivity.class);
        startActivity(intent); // send this intent to start activity
    }
}
