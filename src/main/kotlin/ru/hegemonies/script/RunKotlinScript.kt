package ru.hegemonies.script

import org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine
import javax.script.ScriptEngineManager

/**
 * Выполняет kotlin script.
 */
fun runScript(sourceCode: String): String? {
    val scriptEngine = ScriptEngineManager()
    // JVM знает, что для расширения kts необходимо использовать KotlinJsr223JvmLocalScriptEngineFactory
    val factory = scriptEngine.getEngineByExtension("kts").factory
    val engine = factory.scriptEngine as KotlinJsr223JvmLocalScriptEngine
    return engine.eval(sourceCode) as? String
}
