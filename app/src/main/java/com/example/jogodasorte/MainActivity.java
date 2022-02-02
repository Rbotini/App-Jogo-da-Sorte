package com.example.jogodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String TAG = "Sorteio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){
        EditText numero = findViewById(R.id.editTextNumero);
        TextView jogar = findViewById(R.id.textViewNumeroSorteado);
        int x = new Random().nextInt(10);
        Log.i(TAG, "sortear:  "+ x);
        int numeroJogador = Integer.parseInt(numero.getText().toString()) ;
        if (numeroJogador == x){
            jogar.setText("Você acertou numero Sorteio:"+x);
        }else{
            jogar.setText("Você errou numero Sorteio:"+x);
        }


    }
}