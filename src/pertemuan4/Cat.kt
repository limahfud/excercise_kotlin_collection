package pertemuan4

abstract class Cat {

    fun speak() {
        println("Meowwww")
    }

    abstract fun getColor() : String
}

abstract class Cheetah {
    abstract fun run()
}

class PersianCat : Cat() {

    fun speakPersian() {
        println("Hmmmmmm")
    }

    override fun getColor(): String {
        return "white"
    }

}