package ru.hegemonies.lexer

enum class TokenType(val token: String, val grammarName: String) {
    START("", "start"),

    L_CURVE_BRACE("{", ""),
    L_DOUBLE_CURVE_BRACE("{{", "variable_open_symbol"),
    R_CURVE_BRACE("}", ""),
    R_DOUBLE_CURVE_BRACE("}}", "variable_close_symbol"),

    EQUALS("=", ""),

    DOUBLE_EQUALS("==", "conditional_expression_operator_operations"),
    NOT_EQUALS("!=", "conditional_expression_operator_operations"),
    STRONG_GREATER(">", "conditional_expression_operator_operations"),
    GREATER_EQUALS(">=", "conditional_expression_operator_operations"),
    STRONG_LESS("<", "conditional_expression_operator_operations"),
    LESS_EQUALS("<=", "conditional_expression_operator_operations"),
}
