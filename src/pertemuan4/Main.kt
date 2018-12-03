package pertemuan4

fun main(args: Array<String>) {






//    val dog = Dog()
//
//    dog.move()
//
//    dog.speak()
//
//    // Hi, Im barking
//    dog.bark()
//
//    println(100.doubleIt())
//
//    println(IntegerUtil.doubleIt(100))
//
//
    val dog = Dog()

    var fungsiBilas : (Int) -> Boolean = { angka ->
        for (i in 1..angka) println("Dibilas ....")
        true
    }

    var fungsiGoreng : (Int) -> Boolean = { n ->
        println("Digoreng sebanyak $n kali")
        false
    }

    dog.clean(fungsiBilas)


//    dog.clean(fungsiGoreng)

//    val cleanerPertama = CleanerA()
//    val cleanerKedua = CleanerB1()
//
//    val dog = Dog()
//
//    dog.cleanWithCleaner(object : Cleaner {
//
//        override fun bersihkan(): Boolean {
//            println("pokoknya dicuci dan bersih")
//            return true
//        }
//
//    })

}

fun jalankanCleaner(cleaner: Cleaner) {
    cleaner.bersihkan()
}

fun jalankanBeautifier(beautifier: Beautifier) {
    beautifier.cantikkan()
}

