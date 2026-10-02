package com.example.state;

public class EstadoDisponivel implements EstadoQuarto {
    @Override
    public void reservar(Quarto quarto) {
        System.out.println("Quarto reservado com sucesso!");
        quarto.setEstado(new EstadoReservado());
    }

    @Override
    public void ocupar(Quarto quarto) {
        System.out.println("Quarto ocupado diretamente (check-in realizado).");
        quarto.setEstado(new EstadoOcupado());
    }

    @Override
    public void limpar(Quarto quarto) {
        System.out.println("O quarto já está limpo e disponível, não precisa de limpeza agora.");
    }

    @Override
    public void liberar(Quarto quarto) {
        System.out.println("O quarto já está disponível.");
    }

    @Override
    public String getNomeEstado() {
        return "Disponível";
    }
}