package testNumeros

import ArrayEnteros
import org.junit.jupiter.api.*
import java.time.Instant
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class TestDiferenteArrayEnteros {

    private val array = ArrayEnteros(arrayOf(5, 8, 7, 2, 9))

    @BeforeEach
    fun hora(){
        println("comienzo test : ${Instant.now()}")
    }

    @AfterEach
    fun testTerminado(){
        println("finaliza test : ${Instant.now()}")
    }

    @Test
    @DisplayName("Este test comprueba si el primer valor del array ordenado es igual que el valor mayor del array")
    @Order(4)
    fun primeroOrdenado(){
        assertEquals(array.ordenado().first(), array.mayor(),"No son iguales")
    }

    @Test
    @DisplayName("Este test comprueba si la diferencia entre el mayor y el menor es mayor que 5")
    @Order(3)
    fun diferenciaMayorMenor(){
        assertTrue(array.mayor() - array.menor() > 5,"La diferencia entre el mayor y el menor es menor que 5")
    }

    @Test
    @DisplayName("Este test comprueba si el valor mayor es mayor que 15")
    @Order(2)
    fun mayor(){
        assertFalse(array.mayor() < 15,"El número mayor es menor que 15")
    }

    @Test
    @DisplayName("Este test comprueba si el array no contiene el número 6")
    @Order(1)
    fun testNoContieneNumero(){
        assertFalse(array.contieneNumero(6),"El array contiene el número 6")
    }

}