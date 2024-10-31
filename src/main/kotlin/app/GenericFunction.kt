package app

import data.Function

fun main() {
    val function = Function("Otong")

    function.sayHello<String>("Agus")
    function.sayHello("Agus")

    function.sayHello<Int>(100)
    function.sayHello(100)
}