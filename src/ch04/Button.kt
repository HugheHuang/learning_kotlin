package ch04

/**Title  = Button.java
 *  Author = Hughe
 *  Time   = 2017-12-13 11:13
 */
class Button : Clickable ,Focusable {
    override fun click() = println("clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}