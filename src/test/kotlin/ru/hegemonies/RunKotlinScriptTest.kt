package ru.hegemonies

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.hegemonies.script.runScript

class RunKotlinScriptTest {

    @Test
    fun `success return value`() {
        val expected = "hello"
        val actual = runScript(""" "hello" """)
        Assertions.assertEquals(expected, actual)
    }
}
