package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * NUMBER_LITERAL
 *     =
 *     literal_type:`number`
 *     whole:INTEGER_LITERAL
 *     [ "." fractional:INTEGER_LITERAL ]
 *     [ ( "e" | "E" ) exponent:SIGNED_INTEGER_LITERAL ]
 *     ;
 */
class NumberLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "NUMBER_LITERAL",
    location = location,
    value = value
)
