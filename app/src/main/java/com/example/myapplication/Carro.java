package com.example.myapplication;

import android.util.Log;

public class Carro extends Veiculo {

    public Carro(String placa, String marca, String modelo, int ano, boolean status, boolean aberto) {
        super(placa, marca, modelo, ano, status, aberto);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "aberto=" + aberto +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", status=" + status +
                '}';
    }

    @Override
    public void ligar() {
        if (status) {
            Log.i("CarroLigarErro", "O carro já está ligado.");
        } else {
            status = true;
            Log.i("CarroLigar", "O carro foi ligado.");
        }
    }

    @Override
    public void desligar() {
        if (!status) {
            Log.i("CarroDesligarErro", "O carro já está desligado.");
        } else {
            status = false;
            Log.i("CarroDesligar", "O carro foi desligado.");
        }
    }

    @Override
    public void acelerar() {
        if (!status) {
            Log.i("CarroAcelerarErro", "O carro está desligado. Ligue-o antes de acelerar.");
        } else {
            Log.i("CarroAcelerar", "O carro está acelerando.");
        }
    }

    @Override
    public void frear() {
        if (!status) {
            Log.i("CarroFrearErro", "O carro está desligado. Ligue-o antes de frear.");
        } else {
            Log.i("CarroFrear", "O carro está freando.");
        }
    }

    public void abrirPorta() {
        if (aberto) {
            Log.i("CarroAbrirPortaErro", "A porta já está aberta.");
        } else {
            aberto = true;
            Log.i("CarroAbrirPorta", "A porta do carro foi aberta.");
        }
    }

    public void fecharPorta() {
        if (!aberto) {
            Log.i("CarroFecharPortaErro", "A porta já está fechada.");
        } else {
            aberto = false;
            Log.i("CarroFecharPorta", "A porta do carro foi fechada.");
        }
    }

}
