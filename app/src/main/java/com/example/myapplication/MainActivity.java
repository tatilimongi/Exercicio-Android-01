package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

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

        Gerente gerente = new Gerente("Cleitinho", 8000.00, "TI");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Cleide", 5000.00, "Java");

        gerente.realizarTarefa();
        desenvolvedor.realizarTarefa();

        gerente.definirMeta();
        desenvolvedor.escreverCodigo();

        String resultado = gerente.getNome() + " recebe um salário de R$ " + gerente.calcularSalario() + "\n" +
                desenvolvedor.getNome() + " recebe um salário de R$ " + desenvolvedor.calcularSalario();

        TextView textView = findViewById(R.id.textView);
        textView.setText(resultado);
    }
}