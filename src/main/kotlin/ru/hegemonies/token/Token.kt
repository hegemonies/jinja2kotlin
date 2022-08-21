package ru.hegemonies.token

import ru.hegemonies.token.start.StartToken

abstract class Token(
    val grammarName: String,
    val location: TokenLocation,
    val value: String,
) {
    companion object {
        val START = StartToken()
    }
}
