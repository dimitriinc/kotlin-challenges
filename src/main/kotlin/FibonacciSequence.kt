// Write a function that generates the Fibonacci sequence up to a specified number of terms.

fun generateFibonacci(num: Int): List<Int> {
    val fibonacciSequence = mutableListOf<Int>()
    for (i in 0 until num) {
        fibonacciSequence.add(fibonacciRecursive(i))
    }
    return fibonacciSequence
}

fun fibonacciRecursive(num: Int): Int {
    return if (num <= 1) {
        num
    } else {
        fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2)
    }
}