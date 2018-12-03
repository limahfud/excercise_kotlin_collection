package pertemuan4;

interface Cleaner {
    fun bersihkan() : Boolean

    fun keringkan() : Int
}

interface Beautifier {
    fun cantikkan()


}


class CleanerA : Cleaner {

    override fun bersihkan() : Boolean {
        println("disabun")
        println("disiram")
        println("dibilas")

        return true
    }

}

abstract class CleanerB : Cleaner, Beautifier {

    abstract override fun cantikkan()

    override fun bersihkan(): Boolean {
        println("dikejar")
        println("dimasukkan ke sawah")

        return false
    }

}

class CleanerB1 : CleanerB() {
    override fun cantikkan() {
        println("Cantikkan dengan vitamin b1")
    }

}

class CleanerB2 : CleanerB() {
    override fun cantikkan() {
        println("Cantikkan dengan vitamin b2")
    }

}

class CleanerC : Cleaner {

    override fun bersihkan(): Boolean {
        println("dikipasin")

        return true
    }

}