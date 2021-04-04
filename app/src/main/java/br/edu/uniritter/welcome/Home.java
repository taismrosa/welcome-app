package br.edu.uniritter.welcome;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView homeText = (TextView) findViewById(R.id.welcomeText);
        Intent itt = getIntent();
        homeText.setText("Bem-vindo(a), " + itt.getExtras().getString("name"));
    }
}