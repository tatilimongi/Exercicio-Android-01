package com.example.myapplication;

import android.util.Log;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calcularBonus();

    public void exibirDetalhes(){
        Log.i("Funcionario", "Nome: " + nome + ", Salário: R$" + salario);
    }

}

