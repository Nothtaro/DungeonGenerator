import kotlin.random.Random

class Room(var size: Size) {
    companion object {
        private const val minWidth = 16
        private const val minHeight = 8

        private const val maxWidth = 32
        private const val maxHeight = 16

        fun generate() : Room{
            return Room(Size(Random.nextInt(minWidth,maxWidth),Random.nextInt(minHeight,maxHeight)))
        }
    }
}