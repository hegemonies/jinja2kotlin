package ru.hegemonies.lexer

object Lexer {

    fun parse(rawCode: String): List<Token> {

        val tokens = mutableListOf(Token.START)

        rawCode.ifEmpty {
            return tokens
        }



        TODO("not implemented yet")
    }
}
