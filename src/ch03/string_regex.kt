package ch03

/**Title  = string_regex.java
 *  Author = Hughe
 *  Time   = 2017-12-11 22:54
 */

fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null) {
        val (direcory, fileName, extension) = matchResult.destructured
        println("Dir： $direcory, name: $fileName, ext: $extension")
    }
}

fun sumA(a: Int, b: Int): Int{
    fun sumB(): Int{
      return   a+b
    }
    return sumB()
}