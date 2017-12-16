package ch02

/**Title  = ch02.Expr.java
 *  Author = Hughe
 *  Time   = 2017-12-09 17:42
 */

interface Expr
class Num(val value:Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e){
        is Num ->{
            e.value
        }
        is Sum ->{
            eval(e.left) + eval(e.right)
        }
        else ->
            throw IllegalAccessException("Unknown Expression")
    }

