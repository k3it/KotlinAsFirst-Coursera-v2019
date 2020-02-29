package lesson1.task1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SimpleKtTest {

    @Test
    fun quadraticRootProduct() {
        assertEquals(
            2.0,
            quadraticRootProduct(
                1.0, -3.0, 2.0
            ),
            1e-13
        )
    }

    @Test
    fun quadraticEquationRoot() {
        assertEquals(
            2.0,
            quadraticEquationRoot(
                1.0, -3.0, 2.0
            ),
            1e-13

        )
    }
}