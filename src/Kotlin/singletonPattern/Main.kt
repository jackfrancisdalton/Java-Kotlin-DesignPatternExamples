package Kotlin.singletonPattern


fun main(args : Array<String>) {

    //Ed and Jack both share the single instance of the fridge door
    var jack: Person = Person("Jack Dalton", FridgeDoor)
    var ed: Person = Person("Ed Woollard", FridgeDoor)

    //changes made internally in both Ed and Jack objects update the same instance of fridge door
    jack.setFridgeMessage("Hey Ed what do you think of Obama?")
    ed.checkFridgeMessage()
    ed.setFridgeMessage("He's alright.")
    jack.checkFridgeMessage()
}