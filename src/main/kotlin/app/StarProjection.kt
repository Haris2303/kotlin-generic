package app

fun displayLength(array: Array<*>) {
    println("Length array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1,2,4,5,6,7,8,9,10)
    val arrayString: Array<String> = arrayOf("Agus", "Yanto", "Otong", "Ucup", "Budiono")

    displayLength(arrayInt)
    displayLength(arrayString)
}