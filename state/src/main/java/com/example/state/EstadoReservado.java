package com.example.state;

public class EstadoReservado implements EstadoQuarto {
    @Override
    public void reservar(Quarto quarto) {
        System.out.println("Este quarto já está reservado.");
    }

    @Override
    public void ocupar(Quarto quarto) {
        System.out.println("Check-in realizado! Hóspede entrou no quarto reservado.");
        quarto.setEstado(new EstadoOcupado());
    }

    @Override
    public void limpar(Quarto quarto) {
        System.out.println("Não é possível limpar um quarto que está reservado.");
    }

    @Override
    public void liberar(Quarto quarto) {
        System.out.println("Reserva cancelada. O quarto voltou a ficar disponível.");
        quarto.setEstado(new EstadoDisponivel());
    }

    @Override
    public String getNomeEstado() {
        return "Reservado";
    }
}