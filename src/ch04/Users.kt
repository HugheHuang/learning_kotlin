package ch04

/**Title  = Users.java
 *  Author = Hughe
 *  Time   = 2017-12-16 20:49
 */

//val意味着相应属性会用构造方法的参数初始化
class User1(val nickname: String)

//带一个参数的构造方法
class User2 constructor(_nickname: String){
    val nickname: String

    //初始化语句块
    init {
        nickname = _nickname
    }
}

//带一个参数的构造方法
class User3(){
    //用参数初始化属性

    val a = {x: Int,y:Int ->
        println(x)
        println(y)
        x+y
    }
}