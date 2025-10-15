package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SaisieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie);

        EditText etNom = findViewById(R.id.etNom);
        EditText etAge = findViewById(R.id.etAge);
        EditText etSexe = findViewById(R.id.etSexe);
        EditText etSymptome = findViewById(R.id.etSymptome);
        EditText etAllergie = findViewById(R.id.etAllergie);
        EditText etContact = findViewById(R.id.etContact);
        Button btnEnvoyer = findViewById(R.id.btnEnvoyer);

        btnEnvoyer.setOnClickListener(v -> {
            // Récupération des données
            String nom = etNom.getText().toString();
            String age = etAge.getText().toString();
            String sexe = etSexe.getText().toString();
            String symptome = etSymptome.getText().toString();
            String allergie = etAllergie.getText().toString();
            String contact = etContact.getText().toString();

            // Création du Bundle
            Bundle bundle = new Bundle();
            bundle.putString("nom", nom);
            bundle.putString("age", age);
            bundle.putString("sexe", sexe);
            bundle.putString("symptome", symptome);
            bundle.putString("allergie", allergie);
            bundle.putString("contact", contact);

            // Envoi vers ResultatActivity
            Intent intent = new Intent(SaisieActivity.this, ResultatActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
