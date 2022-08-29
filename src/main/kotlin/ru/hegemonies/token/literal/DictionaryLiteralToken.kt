package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * DICTIONARY_LITERAL
 *     =
 *     literal_type:`dictionary`
 *     (
 *     | ( "{" {SP}* value+:dictionary_key_value { {SP}* "," {SP}* value+:dictionary_key_value } {SP}* "}" )
 *     | ( "{" {SP}* "}" )
 *     )
 *     ;
 */
class DictionaryLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "DICTIONARY_LITERAL",
    location = location,
    value = value
)
