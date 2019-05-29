package br.com.digitalhouse.exercicio20190522;

import android.content.Intent;
import android.os.Parcelable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInputLayoutNome;
    private TextInputLayout textInputLayoutSobrenome;
    private TextInputLayout textInputLayoutIdade;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Inicializa objetos
        textInputLayoutNome = findViewById(R.id.textInputLayoutNome);
        textInputLayoutSobrenome = findViewById(R.id.textInputLayoutSobrenome);
        textInputLayoutIdade = findViewById(R.id.textInputLayoutIdade);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), MainActivity.class);

                //Prepara dados para envio a outra tela
                Bundle bundle = new Bundle();
                bundle.putString("NOME", textInputLayoutNome.getEditText().getText().toString());
                bundle.putString("SOBRENOME", textInputLayoutSobrenome.getEditText().getText().toString());
                bundle.putString("IDADE", textInputLayoutIdade.getEditText().getText().toString());

                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

    }
}
