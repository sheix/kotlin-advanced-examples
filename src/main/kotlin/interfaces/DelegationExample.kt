package interfaces

interface Named {
    val name: String
}

interface Node {
    fun children(): List<Node>
}

class Class : Lazy<Node> by lazyOf(Folder())
{}

class Folder : Node, Named by NamedFileSystemObject {

    private val nodes: List<Node> = listOf()

    override fun children(): List<Node> {
        return nodes
    }

}


class File : Node, Named by NamedFileSystemObject {
    override fun children(): List<Node> {
        return emptyList<Node>()
    }

}


object NamedFileSystemObject : Named {

    private var internalName: String = ""
    override var name: String
        get() = internalName
        set(value) {
            internalName = value.toLowerCase()
        }
}

