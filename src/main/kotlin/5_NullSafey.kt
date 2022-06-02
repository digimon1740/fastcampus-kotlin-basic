fun getNullStr(): String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)


    //throw NullPointerException()

//    val c: String? = null
//    val d = c!!.length

    println(Java_NullSafety.getNullStr()?.length ?: 0)





}