package ru.hegemonies.token.literal

import ru.hegemonies.token.Token
import ru.hegemonies.token.TokenLocation

/**
 * LITERAL
 *     =
 *     | NONE_LITERAL
 *     | STRING_LITERAL
 *     | NUMBER_LITERAL
 *     | BOOLEAN_LITERAL
 *     | DICTIONARY_LITERAL
 *     | LIST_LITERAL
 *     | EXPLICIT_TUPLE_LITERAL
 *     ;
 */
abstract class LiteralToken(
    grammarName: String,
    location: TokenLocation,
    value: String
) : Token(grammarName, location, value)
