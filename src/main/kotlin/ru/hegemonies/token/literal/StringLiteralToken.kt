package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * STRING_LITERAL
 *     =
 *     | STRING_LITERAL_SINGLE_QUOTE
 *     | STRING_LITERAL_DOUBLE_QUOTE
 *     ;
 *
 *  STRING_LITERAL_SINGLE_QUOTE
 *     =
 *     literal_type:`string`
 *     "'" value:{ !"'" /./ }* "'"
 *     ;
 *
 * STRING_LITERAL_DOUBLE_QUOTE
 *     =
 *     literal_type:`string`
 *     '"' value:{ !'"' /./ }* '"'
 *     ;
 */
class StringLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "STRING_LITERAL",
    location = location,
    value = value
)
