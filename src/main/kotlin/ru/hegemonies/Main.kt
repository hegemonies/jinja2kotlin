package ru.hegemonies

import ru.hegemonies.script.runScript
import kotlin.system.measureTimeMillis

fun main() {
    println("Hello world!")

    measureTimeMillis {
        println(
            runScript(
                """
                println("hello world!")
                "hi"
                """.trimIndent()
            )
        )
    }.also {
        println("elapsed $it ms")
    }
}
