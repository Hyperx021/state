package com.example.state;

public class EstadoOcupado implements EstadoQuarto {
    @Override
    public void reservar(Quarto quarto) {
        System.out.println("Erro: Não é possível reservar um quarto que está ocupado.");
    }

    @Override
    public void ocupar(Quarto quarto) {
        System.out.println("O quarto já está ocupado.");
    }

    @Override
    public void limpar(Quarto quarto) {
        System.out.println("Erro: Não se pode limpar um quarto enquanto o hóspede estiver dentro.");
    }

    @Override
    public void liberar(Quarto quarto) {
        System.out.println("Check-out realizado! O hóspede saiu. O quarto precisa de limpeza.");
        quarto.setEstado(new EstadoEmLimpeza());
    }

    @Override
    public String getNomeEstado() {
        return "Ocupado";
    }
}