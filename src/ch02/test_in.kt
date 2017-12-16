package ch02

/**Title  = test_in.java
 *  Author = Hughe
 *  Time   = 2017-12-09 18:36
 */

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "digit!"
    in 'a'..'z', in 'A'..'Z' ->"letter!"
    else -> "don't know!"
}