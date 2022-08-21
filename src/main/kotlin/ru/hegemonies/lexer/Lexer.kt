package ru.hegemonies.lexer

import ru.hegemonies.token.Token

object Lexer {

    fun parse(rawCode: String): List<Token> {
        val tokens = mutableListOf(Token.START)

        rawCode.ifEmpty {
            return tokens
        }

        TODO("not implemented yet")
    }
}
