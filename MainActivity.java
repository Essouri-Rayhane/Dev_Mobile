package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 🔹 Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // bouton retour
        }

        // 🔹 Boutons
        Button btnConseils = findViewById(R.id.btnConseils);
        Button btnContact = findViewById(R.id.btnContact);
        Button btnCollecte = findViewById(R.id.btnCollecte);
        Button btnSuivi = findViewById(R.id.btnSuivi);

        btnConseils.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConseilsActivity.class);
            startActivity(intent);
        });

        btnContact.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(intent);
        });

        btnCollecte.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SaisieActivity.class);
            startActivity(intent);
        });

        btnSuivi.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ResultatActivity.class);
            startActivity(intent);
        });
    }

    // 🔹 Gestion du bouton retour de la Toolbar
    @Override
    public boolean onSupportNavigateUp() {
        finish(); // ferme l'activité actuelle
        return true;
    }
}
