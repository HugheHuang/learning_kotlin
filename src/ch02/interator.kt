package ch02

import java.util.*

/**Title  = interator.java
 *  Author = Hughe
 *  Time   = 2017-12-09 18:05
 */
fun interMap(){
    val binaryReps = TreeMap<Char,String>()

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter,binary) in binaryReps){
        println("$letter = $binary")
    }
}