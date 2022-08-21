package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class ExplicitTupleLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "EXPLICIT_TUPLE_LITERAL",
    location = location,
    value = value
)
