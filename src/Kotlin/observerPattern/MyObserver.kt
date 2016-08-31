package Kotlin.observerPattern

class MyObserver(var name: String) : Observer {

    var topic:Subject? = null

    constructor(name: String,  topic: Subject) : this(name) {
        this.topic = topic
    }

    override fun update() {
        var msg = topic?.getUpdate(this)
        if(msg == null)
            println(name + ":: No new Message")
        else
            println(name + ":: Consuming message::" + msg)
    }

    override fun setSubject(subject: MySubject) {
        this.topic = subject
    }

}
