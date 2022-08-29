package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

abstract class TupleLiteral(
    grammarName: String,
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = grammarName,
    location = location,
    value = value
)
