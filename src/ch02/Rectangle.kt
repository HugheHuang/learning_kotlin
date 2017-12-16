package ch02

/**Title  = ch02.Rectangle.java
 *  Author = Hughe
 *  Time   = 2017-12-09 11:25
 */
class Rectangle(val height:Int,val width:Int) {
    val isSquare:Boolean
        //get() {return height == width}
        get() = height == width
}