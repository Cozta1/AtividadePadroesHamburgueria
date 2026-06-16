package test.java;

import main.java.avaliacao.HamburguerAvaliado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerAvaliadoTest {

    @Test
    void deveManterConceitoExcelente() {
        HamburguerAvaliado h = new HamburguerAvaliado();
        h.setAvaliacao("EXCELENTE");
        assertEquals("EXCELENTE", h.getAvaliacao());
    }

    @Test
    void deveConverterExcelenteParaNotaNove() {
        HamburguerAvaliado h = new HamburguerAvaliado();
        h.setAvaliacao("EXCELENTE");
        assertEquals(9.0f, h.getNota());
    }

    @Test
    void deveConverterBomParaNotaOito() {
        HamburguerAvaliado h = new HamburguerAvaliado();
        h.setAvaliacao("BOM");
        assertEquals(8.0f, h.getNota());
        assertEquals("BOM", h.getAvaliacao());
    }

    @Test
    void deveConverterRegularParaNotaSete() {
        HamburguerAvaliado h = new HamburguerAvaliado();
        h.setAvaliacao("REGULAR");
        assertEquals(7.0f, h.getNota());
    }

    @Test
    void deveConverterRuimParaNotaZero() {
        HamburguerAvaliado h = new HamburguerAvaliado();
        h.setAvaliacao("RUIM");
        assertEquals(0.0f, h.getNota());
        assertEquals("RUIM", h.getAvaliacao());
    }
}
