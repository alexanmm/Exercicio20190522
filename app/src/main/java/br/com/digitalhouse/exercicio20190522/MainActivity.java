package br.com.digitalhouse.exercicio20190522;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewSaudacao;
    private TextView textViewNome;
    private TextView textViewSobrenome;
    private TextView textViewIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nome = bundle.getString("NOME");
        String sobrenome = bundle.getString("SOBRENOME");
        String idade = bundle.getString("IDADE");

        textViewSaudacao = findViewById(R.id.textViewSaudacao);
        textViewNome = findViewById(R.id.textViewNome);
        textViewSobrenome = findViewById(R.id.textViewSobrenome);
        textViewIdade = findViewById(R.id.textViewIdade);

        textViewNome.setText("Nome: " + nome);
        textViewSobrenome.setText("Sobrenome: " + sobrenome);
        textViewIdade.setText("Idade: " + idade);
        textViewSaudacao.setText("Olá " + nome + " seja bem-vindo!");

    }
}
