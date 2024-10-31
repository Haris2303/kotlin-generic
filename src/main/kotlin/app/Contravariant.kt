package app

class Contravariant<in T> {

    fun sayHello(param: T) {
        println("Hello $param")
    }

//    tidak boleh
//    fun getData(): T = data
}

fun main() {
    val contravariantAny: Contravariant<Any> = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Agus")
//    contravariantString.getData() // error
}