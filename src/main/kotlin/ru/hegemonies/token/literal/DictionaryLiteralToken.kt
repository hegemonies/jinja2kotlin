package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

class DictionaryLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "DICTIONARY_LITERAL",
    location = location,
    value = value
)
