package ru.hegemonies.script

import org.jetbrains.kotlin.cli.common.environment.setIdeaIoUseFallback
import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine
import javax.script.ScriptEngineManager

val scriptEngine by lazy {
    setIdeaIoUseFallback()
    val scriptEngine = ScriptEngineManager()
    // JVM знает, что для расширения kts необходимо использовать KotlinJsr223JvmLocalScriptEngineFactory
    val factory = scriptEngine.getEngineByExtension("kts").factory
    factory.scriptEngine as KotlinJsr223JvmLocalScriptEngine
}

/**
 * Выполняет kotlin script.
 */
fun runScript(sourceCode: String): String? {
    return scriptEngine.eval(sourceCode) as? String
}
