package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T): ObservableProperty<T>(param) {

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int){
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull()
    var description: String by Delegates.vetoable("") { property: KProperty<*>, oldValue: String, newValue: String ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable("") {property: KProperty<*>, oldValue: String, newValue: String ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    var car = Car("Yamaha", 2001)

    car.brand = "Honda"
    println(car.brand)

    car.year = 2005
    println(car.year)

    car.owner = "Agus"
    println(car.owner)

    car.description = "Description"
    println(car.description)

    car.other = "Other"
    println(car.other)
}