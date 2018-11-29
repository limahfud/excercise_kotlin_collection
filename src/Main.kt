// Cara pertama
val conversationJoko = Conversation("Joko", "Wes madang?", 10, "20:10 PM")

// Cara kedua
val conversationAndi = Conversation(lastMessage = "Hi apakabar", name = "Andi", unreadMessage = 8, time = "19:45")

// Cara ketiga
val conversationBaim = Conversation("Baim", "Ktemu jam berapa?", 1)


fun main(args: Array<String>) {
    // Implementasi List
    showListConversation()

//    showSetConversation()

//    showMapConversation()
}



fun showListConversation() {
    val listConversation = mutableListOf(conversationJoko, conversationAndi, conversationBaim)

    println("List Awal : $listConversation")

    listConversation.add(conversationJoko)
    listConversation.add(conversationAndi)

    println("List nomor 1 adalah ${listConversation[1]}" )

    println("List Setelah ditambahkan : $listConversation")
}

fun showSetConversation() {

    val setConversation = mutableSetOf<Conversation>()
    setConversation.add(conversationJoko)
    setConversation.add(conversationBaim)
    setConversation.add(conversationBaim)
    setConversation.add(conversationBaim)

    setConversation.remove(conversationBaim)

    println("Set conversation awal : $setConversation")
}

fun showMapConversation() {

    val mapConversation = mutableMapOf<String, Conversation>()
    mapConversation["pertama"] = conversationBaim
    mapConversation["kedua"] = conversationAndi
    mapConversation["ketiga"] = conversationJoko

    println("Sebelum dihapus : $mapConversation")

    mapConversation.remove("ketiga")

    println("Setelah dihapus : $mapConversation")


    println(mapConversation["ketiga"])
}


data class Person(val name: String,
                  val age: Int)

data class Car(val year: Int,
               val color: String,
               val door: Int)


val car1 = Car(2000, "blue", 4)

fun checkLebihBesar(a: Int, b: Int): String = if (a < b)
    "A lebih kecil daripada B"
 else
    "A lebih besar daripada B"



fun switchCaseKotlin(a: Int) {

    val validNumbers = listOf(1000, 2000, 3000)
    print("$a adalah bilangan ")
    println(when (a) {
        -1, 0, 1 -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        4 -> "Empat"
        in 10..99 -> "Bilangan Puluhan"
        in validNumbers -> "Bilangan ribuan"
        else -> "Lebih dari 4"
    })
}


fun checkTypeData(x: Any) {
    when (x) {
        is String -> println("x adalah sebuah String")
        is Int -> println(" x adalah sebuah integer")
        is Float -> println(" x adalah float")
        is Double -> println(" x adalah double")
        is Boolean -> println(" x adalah boolean")
        else -> println(" x bukan string maupun integer")
    }
}

fun displayValidNumbers() {
    val validNumbers = listOf(1000, 2000, 3000)

    for (number in validNumbers) {
        println(number)
    }

    for (i in 1..100) {
        println("Nomor yang ditampilkan $i")
    }
}



fun main(args: Array<String>) {


    displayValidNumbers()
//    checkTypeData("Hallo dunia")
//    checkTypeData(10)
//    checkTypeData(20.5)
//    println("Hello, World!")
//
//    println("From kotlin : $car1")
//
//    println(checkLebihBesar(10, 20))
//
//    println()
//
//    println(checkLebihBesar(15, 14))

//    switchCaseKotlin(10)
//    switchCaseKotlin(-1)
//    switchCaseKotlin(0)
//    switchCaseKotlin(1)
//    switchCaseKotlin(2)
//    switchCaseKotlin(21)
//    switchCaseKotlin(2000)

}