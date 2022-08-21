package ru.hegemonies.token.literal

import ru.hegemonies.token.Token
import ru.hegemonies.token.TokenLocation

abstract class LiteralToken(
    grammarName: String,
    location: TokenLocation,
    value: String
) : Token(grammarName, location, value)
