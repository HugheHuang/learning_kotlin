package ch02

/**Title  = ch02.Color.java
 *  Author = Hughe
 *  Time   = 2017-12-09 11:32
 */
enum class Color (val r:Int,val g:Int,val b:Int){
    //RED,ORANGE,YELLOW,GREEN,BLUE,INDIGO,VIOLET
    RED(255,0,0),ORANGE(255,165,0),BLUE(0,0,255);

    fun rgb() = (r * 256 +g) * 256 + b
}

fun getMnemonic(color: Color) =
        when (color){
            Color.RED -> "Red"
            Color.ORANGE -> "Orange"
            Color.BLUE -> "Blue"
        }

fun mix(c1: Color, c2: Color) =
        when(setOf(c1,c2)){
            setOf(Color.RED, Color.BLUE) -> Color.BLUE
            setOf(Color.RED, Color.ORANGE) -> Color.ORANGE
            else -> throw Exception("error")
        }