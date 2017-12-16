package ch04

/**Title  = Button.java
 *  Author = Hughe
 *  Time   = 2017-12-13 11:13
 */
/*
class Button : Clickable ,Focusable {
    override fun click() = println("clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}*/

public class Button : View{
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState : State {}
}

class Outer {
    inner class Inner{
        fun getOuterReference(): Outer = this@Outer
    }
}