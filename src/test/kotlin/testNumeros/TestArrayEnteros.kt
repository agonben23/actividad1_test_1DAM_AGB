package testNumeros

import ArrayEnteros
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestArrayEnteros {

    private val array = ArrayEnteros(arrayOf(54, 8, 7, 2, 9))


    @Test
    @DisplayName("Este test comprueba si la suma es mayor que 50")
    fun testSuma(){
        assertTrue(array.suma() > 50,"La suma no es mayor que 50")
    }

    @Test
    @DisplayName("Este test comprueba si el array contiene el número 10")
    fun testContieneNumero(){
        assertTrue(array.contieneNumero(10),"El array no contiene el numero 10")
    }

    @Test
    @DisplayName("Este test comprueba si la suma no es nula")
    fun testSumaNoNula(){
        assertTrue(array.suma() != 0,"La suma es nula")
    }

    @Test
    @DisplayName("Este test comprueba si la suma es mayor que 50el menor valor del array no es igual a 5")
    fun testMenor(){
        assertFalse(array.menor() == 5,"El numero menor es 5")
    }

}