package com.example.healthcare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ResultatActivity extends AppCompatActivity {

    private TextView tvResultat;
    private Button btnRefaire, btnAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);


        // 🔹 Récupérer les éléments
        tvResultat = findViewById(R.id.tvResultat);
        btnRefaire = findViewById(R.id.btnRefaire);
        btnAccueil = findViewById(R.id.btnAccueil);

        // 🔹 Récupérer les données envoyées depuis SaisieActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nom = extras.getString("nom", "N/A");
            String age = extras.getString("age", "N/A");
            String sexe = extras.getString("sexe", "N/A");
            String symptome = extras.getString("symptome", "N/A");
            String allergie = extras.getString("allergie", "N/A");
            String contact = extras.getString("contact", "N/A");

            String message = "\n👤 Nom : " + nom +
                    "\n\n🎂 Âge : " + age +
                    "\n\n⚥ Sexe : " + sexe +
                    "\n\n🤒 Symptômes : \n" + symptome +
                    "\n\n💊 Allergies : " + allergie +
                    "\n\n📞 Contact : " + contact +
                    "\n\n\n\n✅ Merci ! Vos informations ont été enregistrées.";
            tvResultat.setText(message);
        }

        // 🔹 Bouton refaire la saisie
        btnRefaire.setOnClickListener(v -> {
            Intent i = new Intent(ResultatActivity.this, SaisieActivity.class);
            startActivity(i);
            finish(); // ferme l'activité actuelle
        });

        // 🔹 Bouton retour à l'accueil
        btnAccueil.setOnClickListener(v -> {
            Intent i = new Intent(ResultatActivity.this, MainActivity.class);
            startActivity(i);
            finish(); // ferme l'activité actuelle
        });
    }

    // 🔹 Gérer le clic sur la flèche de retour de la Toolbar
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
