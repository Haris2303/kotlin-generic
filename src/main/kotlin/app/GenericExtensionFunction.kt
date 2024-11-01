package app

class Data<T>(val data: T)

fun Data<String>.printString() {
    println(this.data)
}

fun Data<Int>.printInt() {
    println(this.data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("String")

    data1.printInt() // error
    data2.printString() // bisa
}