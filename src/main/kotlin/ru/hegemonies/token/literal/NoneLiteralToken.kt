package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class NoneLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "NONE_LITERAL",
    location = location,
    value = value
)
