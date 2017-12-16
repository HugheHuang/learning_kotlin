package ch04

/**Title  = RichButton.java
 *  Author = Hughe
 *  Time   = 2017-12-13 11:39
 */

//这个类是open的，可以被继承
open class RichButton : Clickable {

    //重写了一个open函数，依旧是open的
    final override fun click() {
    }

    //open，可以重写
    open fun animate() {}

    //默认final，不可重写
    fun disable() {}
}