class ArrayEnteros(private val array: Array<Int>) {

    fun suma(): Int {
        return array.sum()
    }

    fun mayor(): Int {
        return array.maxOf { it }
    }

    fun ordenado(): Array<Int> {
        return array.sortedArrayDescending()
    }

    fun menor(): Int{
        return array.minOf { it }
    }

    fun contieneNumero(numero: Int): Boolean {
        return array.contains(numero)
    }

}
