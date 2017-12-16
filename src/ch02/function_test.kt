package ch02

import java.io.BufferedReader
import java.io.StringReader

/**Title  = ch02.Person.java
 *  Author = Hughe
*  Time   = 2017-12-08 23:32
*/
fun main(args:Array<String>){
    /*val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello,${name}")
    val rectangle = ch02.Rectangle(41,42)
    println(rectangle.isSquare)
    println(ch02.Color.RED.rgb())
    println(ch02.getMnemonic(ch02.Color.BLUE))
    ch02.interMap();
    println(ch02.isLetter('B'))
    println(ch02.isNotDigit('0'))
    println(ch02.recognize('a'))*/
    println(readNumber(BufferedReader(StringReader("not a number"))))

}

fun max1(a:Int,b:Int) = if(a>b) a else b

fun max2(a:Int,b:Int):Int{
    return if(a>b) a else b
}