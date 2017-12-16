package ch04

/**Title  = Focusable.java
 *  Author = Hughe
 *  Time   = 2017-12-13 11:26
 */
interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("focusable!")
}