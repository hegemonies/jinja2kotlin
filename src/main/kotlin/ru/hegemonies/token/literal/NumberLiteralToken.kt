package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class NumberLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "NUMBER_LITERAL",
    location = location,
    value = value
)
