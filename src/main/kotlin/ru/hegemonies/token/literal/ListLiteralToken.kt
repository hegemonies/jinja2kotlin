package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * LIST_LITERAL
 *     =
 *     literal_type:`list`
 *     (
 *     | ( "[" {SP}* value+:variable_identifier {SP}* { "," {SP}* value+:variable_identifier }* {SP}* "]" )
 *     | ( "[" {SP}* "]" )
 *     )
 *     ;
 */
class ListLiteralToken(
    location: TokenLocation,
    value: String
) : LiteralToken(
    grammarName = "LIST_LITERAL",
    location = location,
    value = value
)
