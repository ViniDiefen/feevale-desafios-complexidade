package br.feevale.desafios.desafio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldbachTest {

    private final Goldbach goldbach = new Goldbach();

    @Test
    void shouldReturnThreeNumbers() {
        int[] result = goldbach.findTopThree(1_000_000, 2_000_000);

        assertEquals(3, result.length);
    }

    @Test
    void shouldReturnOnlyEvenNumbers() {
        int[] result = goldbach.findTopThree(1_000_000, 2_000_000);

        for (int n : result) {
            assertEquals(0, n % 2);
        }
    }

    @Test
    void shouldReturnNumbersInsideRange() {
        int start = 1_000_000;
        int end = 2_000_000;

        int[] result = goldbach.findTopThree(start, end);

        for (int n : result) {
            assertTrue(n >= start);
            assertTrue(n <= end);
        }
    }
}