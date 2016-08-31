package Kotlin.observerPattern


fun main(args : Array<String>) {
    var subject = MySubject()
    var observerOne = MyObserver("observer 1")
    var observerTwo = MyObserver("observer 2")
    var observerThree = MyObserver("observer 3")

    bindObserverSubject(observerOne, subject)
    bindObserverSubject(observerTwo, subject)
    bindObserverSubject(observerThree, subject)

    subject.postMessage("Hello World")
    subject.postMessage("Hello Mars")
    observerOne.update()
    observerTwo.update()
}

fun bindObserverSubject(observer: Observer, subject: MySubject): Unit {
    subject.register(observer)
    observer.setSubject(subject)
}
