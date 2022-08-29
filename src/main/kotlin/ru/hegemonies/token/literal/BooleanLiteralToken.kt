package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * BOOLEAN_LITERAL
 *     =
 *     literal_type:`boolean`
 *     (
 *     | ( ("true" | "True") value:`True`)
 *     | ( ("false" | "False") value:`False`)
 *     )
 *     ;
 */
class BooleanLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "BOOLEAN_LITERAL",
    location = location,
    value = value
)
