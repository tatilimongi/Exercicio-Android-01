package com.example.myapplication;

import android.util.Log;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void calcularBonus(){
        bonus = salario * 0.2;
        Log.i("Funcionario", "Gerente: " + nome + ", Bonus: R$" + bonus);
    }
}

