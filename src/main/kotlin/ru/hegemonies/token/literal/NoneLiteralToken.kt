package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * NONE_LITERAL
 *     =
 *     literal_type:`none`
 *     ( "none" | "None" ) value:`None`
 *     ;
 */
class NoneLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "NONE_LITERAL",
    location = location,
    value = value
)
