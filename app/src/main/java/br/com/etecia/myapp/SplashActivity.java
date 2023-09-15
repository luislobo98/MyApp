package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    //declarar uma variável global do tipo objeto no layout
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //Atribuir a variável para o ID
        imgLogo = findViewById(R.id.imgLogo);

        //Efetivar o botão clicavél na imagem
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Indicar onde estou (local.this) e para onde vou (local.class)
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        });

    }
}