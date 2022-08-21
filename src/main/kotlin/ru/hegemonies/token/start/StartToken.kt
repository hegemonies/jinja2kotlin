package ru.hegemonies.token.start

import ru.hegemonies.token.Token
import ru.hegemonies.token.TokenLocation

class StartToken : Token(
    grammarName = "START",
    location = TokenLocation.ZERO,
    value = ""
)
