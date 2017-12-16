package ch02

import java.io.BufferedReader

/**Title  = exception.java
 *  Author = Hughe
 *  Time   = 2017-12-09 18:51
 */

fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}