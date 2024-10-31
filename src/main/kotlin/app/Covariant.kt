package app

class Covariant<out T>(val data: T) {

    fun data(): T = data

//    Tidak boleh membuat function dengan input generic covariant
//    fun setData(param: T) {
//        data = param
//    }
}

fun main() {
    val covariantString: Covariant<String> = Covariant<String>("Otong")
    val covariantAny: Covariant<Any> = covariantString
    println(covariantAny.data())

//    covariantAny.setData(100) tidak boleh
}