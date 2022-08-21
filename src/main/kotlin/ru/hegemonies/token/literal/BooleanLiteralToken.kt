package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class BooleanLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "BOOLEAN_LITERAL",
    location = location,
    value = value
)
