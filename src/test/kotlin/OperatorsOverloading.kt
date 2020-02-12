import operators.Vector
import org.amshove.kluent.`should be`
import org.junit.jupiter.api.Test

class OperatorsOverloading {
    @Test
    fun `unary operator overload`() {
        var incrementedTuple = Vector(1, 2)

        incrementedTuple++

        incrementedTuple `should be` Vector(2, 3)

        incrementedTuple += Vector(3,4)
        incrementedTuple += 1

    }

    @Test
    fun `binary operator overload`() {
        val value = Vector(1, 2) + Vector(4, 6)
    }
}

private operator fun Vector.plus(vector: Vector): Vector {
    return Vector(first + vector.first, second + vector.second)
}

private operator fun Vector.plus(int:Int): Vector {
    return Vector(first + int, second + int)
}


operator fun Vector.inc(): Vector {
    return Vector(this.first + 1, this.second + 1)
}
