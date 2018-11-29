package pertemuan4

fun main(args: Array<String>) {

    val dog = Dog()

    dog.move()

    dog.speak()

    // Hi, Im barking
    dog.bark()


    var fungsiBilas : (Int) -> Boolean = {
        for (i in 1..n) println("Dibilas ....")
        true
    }

    var fungsiGoreng : (Int) -> Boolean = {
        println("Digoreng sebanyak $n kali")
        false
    }

    dog.clean(fungsiBilas)


    dog.clean(fungsiGoreng)
}

