package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConseils = findViewById(R.id.btnConseils);
        Button btnContact = findViewById(R.id.btnContact);

        btnConseils.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConseilsActivity.class);
            startActivity(intent);
        });

        btnContact.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(intent);
        });
    }
}
