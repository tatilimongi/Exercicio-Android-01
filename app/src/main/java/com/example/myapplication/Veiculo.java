package com.example.myapplication;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean status;
    protected boolean aberto;

    public Veiculo(String placa, String marca, String modelo, int ano, boolean status, boolean aberto) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.status = status;
        this.aberto = aberto;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void acelerar();
    public abstract void frear();
    public abstract void abrirPorta();
    public abstract void fecharPorta();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
