package com.example.iodemo2025.realcrash;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.iodemo2025.R;

public class CrashNoActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash_no_action_bar);

        // getActionBar() will throw null pointer exception
        getActionBar().setTitle("This line should crash the app");
    }
}