package ru.hegemonies.tool

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Выполняет [transform] над коллекцией параллельно в [scope] корутин.
 *
 * @return список монад [Deferred] для ожидания получения результата.
 */
suspend inline fun <T : Any, R : Any> Collection<T>.asyncMap(
    scope: CoroutineScope = CoroutineScope(Dispatchers.IO),
    context: CoroutineContext = EmptyCoroutineContext,
    crossinline transform: suspend (element: T) -> R,
): List<Deferred<R>> =
    map { element ->
        scope.async(context) {
            transform(element)
        }
    }

/**
 * Выполняет [transform] над коллекцией параллельно в [scope] корутин.
 *
 * @return список с результирующими элементами.
 */
suspend inline fun <T : Any, R : Any> Collection<T>.parallelMap(
    scope: CoroutineScope = CoroutineScope(Dispatchers.IO),
    context: CoroutineContext = EmptyCoroutineContext,
    crossinline transform: suspend (element: T) -> R,
): List<R> =
    map { element ->
        scope.async(context) {
            transform(element)
        }
    }.awaitAll()
