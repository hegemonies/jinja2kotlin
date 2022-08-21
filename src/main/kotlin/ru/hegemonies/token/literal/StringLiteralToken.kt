package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class StringLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "STRING_LITERAL",
    location = location,
    value = value
)
