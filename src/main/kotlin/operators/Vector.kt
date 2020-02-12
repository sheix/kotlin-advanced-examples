package operators


// In a third-party-other-vendor-sealed-package
class Vector(val first: Int, val second: Int)


fun main() {

    val tuple = Vector(1, 2)

    var first1 = tuple[1]

    val list = listOf(1, 2, 3)
    val (f1, f2, f3) = list

    list[2] == 3



    list.get(2) == 3

    //too bad can't decompose :(
    val (first, second) = tuple

    //how do I fix it?
}

private operator fun Vector.get(i: Int): Int = if (i == 0) first
else second

operator fun Vector.component1(): Int {
    return first
}

operator fun Vector.component2(): Int {
    return second
}

