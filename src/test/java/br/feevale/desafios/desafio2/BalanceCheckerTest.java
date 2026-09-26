package br.feevale.desafios.desafio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceCheckerTest {

    private final BalanceChecker checker = new BalanceChecker();

    @Test
    void shouldConsiderBalancedStructure() {
        int[][] structure = {
                {6, 6, 6}
        };

        assertTrue(checker.isBalanced(structure));
    }

    @Test
    void shouldConsiderUnbalancedStructure() {
        int[][] structure = {
                {6, 7, 8}
        };

        assertFalse(checker.isBalanced(structure));
    }
}