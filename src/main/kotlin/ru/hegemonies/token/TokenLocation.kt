package ru.hegemonies.token

data class TokenLocation(
    val column: Int,
    val row: Int,
) {
    companion object {
        val ZERO = TokenLocation(0, 0)
    }
}
