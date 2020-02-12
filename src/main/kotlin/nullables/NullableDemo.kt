package nullables

class Something {
    val property: Boolean? = null
    val something : Something? = null
}

fun main() {

//    ?.
//
//    !!
//
//            ?:
//

    val `object` = Something()

    val something = Something()
    something.something?.something == null

    val whatsThis = something.something ?: "Hello"
    println(whatsThis)

    if (`object`.property != false)
        println("I'm true or null!")

}
