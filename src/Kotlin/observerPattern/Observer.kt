package Kotlin.observerPattern

interface Observer {
    fun update()
    fun setSubject(subject: MySubject)
}