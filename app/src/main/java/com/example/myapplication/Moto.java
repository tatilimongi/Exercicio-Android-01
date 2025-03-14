package com.example.myapplication;

import android.util.Log;

public class Moto extends Veiculo {
    public Moto(String placa, String marca, String modelo, int ano, boolean status, boolean aberto) {
        super(placa, marca, modelo, ano, status, aberto);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", status=" + isStatus() +
                '}';
    }

    public void ligar(){
        if(status){
            Log.i("MotoLigarErro", "Moto já está ligada");
        }else{
            status = true;
            Log.i("MotoLigar", "Moto ligada");
        }
    }

    public void desligar() {
        if (!status) {
            Log.i("MotoDesligarErro", "Moto já está desligada");
        } else {
            status = false;
            Log.i("MotoDesligar", "Moto desligada");
        }
    }

    public void acelerar() {
        if (status) {
            Log.i("MotoAcelerar", "Moto acelerando");
        } else {
            Log.i("MotoAcelerarErro", "Moto não está ligada");
        }
    }

    public void frear() {
        if (status) {
            Log.i("MotoFrear", "Moto freando");
        } else {
            Log.i("MotoFrearErro", "Moto não está ligada");
        }
    }

    public void abrirPorta() {
        Log.i("MotoAbrirPorta", "Moto não tem porta");
    }

    public void fecharPorta() {
        Log.i("MotoFecharPorta", "Moto não tem porta");
    }


}
