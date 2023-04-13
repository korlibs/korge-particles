package korlibs.korge.particles

import korlibs.korge.*

class ParticlesViewsCompleter : ViewsCompleter {
    override fun completeViews(views: Views) {
        views.viewFactories.addAll(listOf(
            ViewFactory("ParticleEmitter") { ParticleEmitterView(ParticleEmitter()) },
        ))
    }
}
