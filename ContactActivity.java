package com.example.healthcare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        EditText etNom = findViewById(R.id.etNom);
        EditText etMessage = findViewById(R.id.etMessage);
        Button btnEnvoyer = findViewById(R.id.btnEnvoyer);
        ProgressBar progressBar = findViewById(R.id.progressBar);

        btnEnvoyer.setOnClickListener(v -> {
            String nom = etNom.getText().toString();
            String msg = etMessage.getText().toString();

            int progress = 0;
            if (!nom.isEmpty()) progress += 50;
            if (!msg.isEmpty()) progress += 50;

            progressBar.setProgress(progress);

            if (progress < 100) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Message envoyé avec succès !", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
