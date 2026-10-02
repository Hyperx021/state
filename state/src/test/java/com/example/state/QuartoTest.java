package com.example.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuartoTest {

    private Quarto quarto;

    @BeforeEach
    public void setUp() {
        quarto = new Quarto(101);
    }

    @Test
    public void DeveReservarQuartoDisponivel() {
        quarto.reservar();
        assertEquals("Reservado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveOcuparQuartoDisponivelDireto() {
        quarto.ocupar();
        assertEquals("Ocupado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveLimparQuartoDisponivel() {
        quarto.limpar();
        assertEquals("Disponível", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveLiberarQuartoDisponivel() {
        quarto.liberar();
        assertEquals("Disponível", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveOcuparQuartoReservado() {
        quarto.reservar();
        quarto.ocupar();
        assertEquals("Ocupado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveLiberarQuartoReservadoCancelaReserva() {
        quarto.reservar();
        quarto.liberar();
        assertEquals("Disponível", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarReservarQuartoReservadoNovamente() {
        quarto.reservar();
        quarto.reservar();
        assertEquals("Reservado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarLimparQuartoReservado() {
        quarto.reservar();
        quarto.limpar();
        assertEquals("Reservado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveLiberarQuartoOcupadoVaiParaLimpeza() {
        quarto.ocupar();
        quarto.liberar();
        assertEquals("Em Limpeza", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarReservarQuartoOcupado() {
        quarto.ocupar();
        quarto.reservar();
        assertEquals("Ocupado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarLimparQuartoOcupado() {
        quarto.ocupar();
        quarto.limpar();
        assertEquals("Ocupado", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void deveLiberarQuartoEmLimpezaFicaDisponivel() {
        quarto.ocupar();
        quarto.liberar();
        quarto.liberar();
        assertEquals("Disponível", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarReservarQuartoEmLimpeza() {
        quarto.ocupar();
        quarto.liberar();
        quarto.reservar();
        assertEquals("Em Limpeza", quarto.getEstadoAtual().getNomeEstado());
    }

    @Test
    public void DeveTentarOcuparQuartoEmLimpeza() {
        quarto.ocupar();
        quarto.liberar();
        quarto.ocupar();
        assertEquals("Em Limpeza", quarto.getEstadoAtual().getNomeEstado());
    }
}