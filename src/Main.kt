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
