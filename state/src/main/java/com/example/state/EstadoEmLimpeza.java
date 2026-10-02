package com.example.state;

public class EstadoEmLimpeza implements EstadoQuarto {
    @Override
    public void reservar(Quarto quarto) {
        System.out.println("Erro: O quarto está em limpeza e ainda não pode ser reservado.");
    }

    @Override
    public void ocupar(Quarto quarto) {
        System.out.println("Erro: O quarto está em limpeza, aguarde finalizar para fazer check-in.");
    }

    @Override
    public void limpar(Quarto quarto) {
        System.out.println("A limpeza já está em andamento.");
    }

    @Override
    public void liberar(Quarto quarto) {
        System.out.println("Limpeza concluída! O quarto agora está limpo e disponível.");
        quarto.setEstado(new EstadoDisponivel());
    }

    @Override
    public String getNomeEstado() {
        return "Em Limpeza";
    }
}