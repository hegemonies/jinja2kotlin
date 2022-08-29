package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * EMPTY_TUPLE_LITERAL
 *     =
 *     literal_type:`tuple`
 *     "(" {SP}* ")"
 *     ;
 */
class EmptyTupleLiteral(
    location: TokenLocation,
    value: String
) : TupleLiteral(
    grammarName = "EMPTY_TUPLE_LITERAL",
    location = location,
    value = value
)
