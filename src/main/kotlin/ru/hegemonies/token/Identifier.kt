package ru.hegemonies.token

// IDENTIFIER
//    =
//    /[a-zA-Z_][a-zA-Z0-9_]*/
//    ;
class Identifier(
    location: TokenLocation,
    value: String
) : Token(
    grammarName = "IDENTIFIER",
    location = location,
    value = value
)
