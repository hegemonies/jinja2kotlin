package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class ListLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "LIST_LITERAL",
    location = location,
    value = value
)
