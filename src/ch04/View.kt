package ch04

/**Title  = View.java
 *  Author = Hughe
 *  Time   = 2017-12-16 19:15
 */
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State){}
}