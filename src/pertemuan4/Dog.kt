package pertemuan4

class Dog {

    fun move() {
        println("Hi, I'm moving")
    }


    fun speak() {
        println("Hi, I'm speaking")
    }

    fun clean(caraMembersihkan : (Int) -> Boolean) {
        if (caraMembersihkan( 2 )) {
            println("Hasil nya bersih")
        } else {
            println("Hasilnya kotor")
        }
    }

    fun cleanWithCleaner(cleaner: Cleaner) {
        if (cleaner.bersihkan()) {
            println("Hasil nya bersih")
        } else {
            println("Hasilnya kotor")
        }
    }

    fun walk() {

    }

}