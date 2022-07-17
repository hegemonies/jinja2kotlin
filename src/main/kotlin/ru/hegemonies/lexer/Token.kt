package ru.hegemonies.lexer

data class Token(
    val type: TokenType,
    val location: TokenLocation,
    val value: String,
)