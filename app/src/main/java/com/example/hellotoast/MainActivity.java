package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des composants de l'interface graphique avec le code Java
        textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        // Action effectuée lors du clic sur le bouton "TOAST"
        buttonToast.setOnClickListener(v -> {
            Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
        });

        // Action effectuée lors du clic sur le bouton "COUNT"
        buttonCount.setOnClickListener(v -> {
            count++;
            // Met à jour le texte du TextView avec la nouvelle valeur
            textCount.setText(String.valueOf(count));
        });
    }
}
