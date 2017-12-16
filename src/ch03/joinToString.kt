package ch03

/**Title  = joinToString.java
 *  Author = Hughe
 *  Time   = 2017-12-10 20:42
 */

fun <T> Collection<T>.joinToString(
        collection: Collection<T>,
        separator: String = ",",
        prefix: String ="",
        postfix: String = ""
):String {
    var result = StringBuilder(prefix)

    for((index,element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length-1)

val String.lastChar: Char
    get() = get(length-1)

var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

infix fun Any.to(other: Any) = Pair(this,other)