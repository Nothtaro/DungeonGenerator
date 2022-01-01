class TreeNode {
    private lateinit var parent:TreeNode
    var children = mutableListOf<TreeNode>()
    private var hasParent = false
    private var properties:Any = Any()
    private var initial = "N/A"
    private var isSplinted = false
    private var id = 0

    private constructor(parent: TreeNode, id: Int) {
        this.parent = parent
        hasParent = true
        this.initial = parent.initial
        this.id = id
    }

    constructor(initial: String) {
        this.initial = initial
    }

    private fun split(count: Int) {
        for (x in 0 until count) {
            children.add(TreeNode(this, x+1))
        }
    }

    fun splitAll(count: Int) {
        children.forEach {
            it.split(count)
        }
        if(!isSplinted) {
            split(count)
            isSplinted = true
        }
    }

    fun printInfo() {
        println("id:${initial + id}, hasParent:${hasParent}" + "\n" + "properties:${properties}" + "\n" + "children:${children.size}")
    }

    fun printInfoAll() {
        if(hasParent) {
            println("parent of ${parent.initial + parent.id}")
        }
        printInfo()
        children.forEach {
            it.printInfoAll()
        }
    }
}