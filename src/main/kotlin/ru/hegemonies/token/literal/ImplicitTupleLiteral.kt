package ru.hegemonies.token.literal

import ru.hegemonies.token.TokenLocation

/**
 * IMPLICIT_TUPLE_LITERAL
 *     =
 *     literal_type:`tuple`
 *     value:TUPLE_LITERAL_CONTENTS
 *     ;
 *
 * TUPLE_LITERAL_CONTENTS
 *     =
 *     | ( @+:variable_identifier {SP}* { "," {SP}* @+:variable_identifier {SP}* }+ )
 *     | ( @+:variable_identifier {SP}* "," {SP}* )
 *     ;
 */
class ImplicitTupleLiteral(
    location: TokenLocation,
    value: String
) : TupleLiteral(
    grammarName = "IMPLICIT_TUPLE_LITERAL",
    location = location,
    value = value
)
