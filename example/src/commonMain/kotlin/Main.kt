import com.soywiz.korge.*
import com.soywiz.korge.scene.*
import com.soywiz.korge.view.*
import org.korge.samples.mymodule.*

suspend fun main() = Korge().start {
    sceneContainer().changeTo({ MainParticles() })
}
