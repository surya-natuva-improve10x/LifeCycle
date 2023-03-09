package com.improve10x.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "on create method called", Toast.LENGTH_LONG).show();
        Log.d("LIFECYCLE","on create method called");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view -> {
            Intent firstActivityIntent = new Intent(this,FirstActivity.class);
            startActivity(firstActivityIntent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start method", Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE","on start method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "on resume method", Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE","on resume method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause method", Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE","on resume method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "on stop method", Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE","on stop method called");
    }


}