package com.example.myapplication;

import android.util.Log;

public class Desenvolvedor extends Funcionario {
    private double bonus;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        bonus = salario * 0.1;
        Log.i("Funcionario", "Desenvolvedor: " + nome + ", Bonus: R$" + bonus);
    }
}

