data class Conversation(val name: String,
                        val lastMessage: String,
                        val unreadMessage: Int,
                        val time: String = "19:00") {

    fun getNameAndMessage(): String {
        return "name = $name, lastMessage= $lastMessage"
    }

}