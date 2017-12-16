package ch04

/**Title  = ch02.Expr.java
 *  Author = Hughe
 *  Time   = 2017-12-09 17:42
 */

sealed class Expr{
    class Num(val value:Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e){
        is Expr.Num -> e.value

        is Expr.Sum -> eval(e.left) + eval(e.right)

    }
