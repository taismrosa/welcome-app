package br.edu.uniritter.welcome;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendButton = (Button) findViewById(R.id.btn);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText loginInput = (EditText) findViewById(R.id.login);
                EditText passwordInput = (EditText) findViewById(R.id.password);
                String user = loginInput.getText().toString();
                String password = passwordInput.getText().toString();
                validateInfo(user, password);
            }
        });
    }

    private void validateInfo(String us, String pw) {
        if (us.isEmpty()) {
            Toast.makeText(this, "Preencha os dados corretamente", Toast.LENGTH_SHORT).show();
        }
        else if (us.equals(pw)) {
            showHome(us);
        }
        else {
            Toast.makeText(this, "Usuário e senha devem ser iguais", Toast.LENGTH_SHORT).show();
        }
    }

    private void showHome(String name) {
        Intent it = new Intent(MainActivity.this, Home.class);
        it.putExtra("name", name);
        startActivity(it);
    }
}