import java.awt.Graphics2D
import java.lang.StringBuilder
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

class DungeonGenerator {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Thread(MapViewer()).start()
        }
    }
}

class MapViewer: Runnable {
    //ウィンドウ初期化
    private val frame = JFrame("MapViewer")
    //ウィンドウのサイズ
    private val width = 800
    private val height = 800
    //マップのサイズ
    private val mapSize = 512

    init {
        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        frame.contentPane.layout = null
        frame.setSize(width, height)
    }

    override fun run() {
        //ウィンドウの可視化
        frame.isVisible = true
        //ループ
        while (true) {
            val g = frame.contentPane.graphics as Graphics2D
            val widthCurrent = (frame.contentPane.width - mapSize) / 2
            val heightCurrent = (frame.contentPane.height - mapSize) / 2
            g.drawRect(widthCurrent,heightCurrent,mapSize,mapSize)
            Thread.sleep(100)
        }
    }
}

