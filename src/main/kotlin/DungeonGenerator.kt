fun main(args: Array<String>) {
    val node = TreeNode("A")
    node.splitAll(2)
    node.splitAll(2)
    node.printInfoAll()
    //Thread(MapViewer()).start()
}