package Kotlin.singletonPattern

class Person constructor(var name:String, var fridgeDoor:FridgeDoor) {

    fun setFridgeMessage(message: String) {
        fridgeDoor.message = message
        println("$name set the message to \"" + message + "\"")
    }

    fun checkFridgeMessage() {
        println("$name reads the message \"" + fridgeDoor.message + "\"")
    }
}