package com.example.state;

public class Quarto {
    private int numero;
    private EstadoQuarto estadoAtual;

    public Quarto(int numero) {
        this.numero = numero;
        this.estadoAtual = new EstadoDisponivel();
    }

    public void setEstado(EstadoQuarto novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public EstadoQuarto getEstadoAtual() {
        return estadoAtual;
    }

    public int getNumero() {
        return numero;
    }

    public void reservar() {
        estadoAtual.reservar(this);
    }

    public void ocupar() {
        estadoAtual.ocupar(this);
    }

    public void limpar() {
        estadoAtual.limpar(this);
    }

    public void liberar() {
        estadoAtual.liberar(this);
    }
}