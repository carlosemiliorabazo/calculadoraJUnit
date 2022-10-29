package org.ufv.dis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora cal;
    double a;
    double b;

    @BeforeEach
    public void init(){
        cal = new Calculadora();
        a = 4;
        b = -2;
    }

    @Test
    @DisplayName("Test método sumar (double, double)")
    void sumarTest() {
        assertEquals(2, cal.sumar(a, b));
    }

    @Test
    @DisplayName("Test método restar (double, double)")
    void restarTest() {
        assertEquals(6, cal.restar(a, b));
    }

    @Test
    @DisplayName("Test método multiplicar (double, double)")
    void multiplicarTest() {
        assertEquals(-8, cal.multiplicar(a, b));
    }

    @Test
    @DisplayName("Test método dividir (double, double)")
    void dividirTest() {
        assertEquals(-2, cal.dividir(a, b));
    }
}