package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Carro carro = new Carro("GTA-3498","Toyota", "Corolla", 2022, false, false);
        Moto moto = new Moto("MPO-6512", "Honda", "CBR", 2023, true, false);

        carro.acelerar();
        carro.frear();
        moto.acelerar();
        moto.frear();

        carro.ligar();
        carro.desligar();
        moto.ligar();
        moto.desligar();

        carro.abrirPorta();
        carro.fecharPorta();
        moto.abrirPorta();
        moto.fecharPorta();

        Log.d("CarroInfo", carro.toString());
        Log.d("MotoInfo", moto.toString());

    }
}