package app

import org.example.data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Otong", 100)
    myDataString.printData()

    val myDataInt: MyData<Int, String> = MyData<Int, String>(10, "Otong")
    myDataInt.printData()
}