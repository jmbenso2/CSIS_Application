package com.example.jonathanbenson.csis_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFaculty(View view) {
        // Create intent from this activity to faculty activity
        Intent intent = new Intent(MainActivity.this, FacultyActivity.class);
        startActivity(intent); // send this intent to start activity
    }

    public void onClickCourseGrid(View view) {
        // Create intent from this activity to course grid activity
        Intent intent = new Intent(MainActivity.this, CourseGridActivity.class);
        startActivity(intent); // send this intent to start activity
    }
}
