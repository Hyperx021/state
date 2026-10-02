package com.example.state;

public interface EstadoQuarto {
    void reservar(Quarto quarto);
    void ocupar(Quarto quarto);
    void limpar(Quarto quarto);
    void liberar(Quarto quarto);
    String getNomeEstado();
}