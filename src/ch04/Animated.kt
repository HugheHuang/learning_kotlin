package ch04

/**Title  = Animated.java
 *  Author = Hughe
 *  Time   = 2017-12-13 11:43
 */

//类是抽象的，不可创建实例
abstract class Animated {

    //抽象函数必须被重写
    abstract fun animate()

    //非抽象函数并不是默认open的，但是可以标注成open
    open fun stopAnimating(){}

    fun animateTwice(){}
}