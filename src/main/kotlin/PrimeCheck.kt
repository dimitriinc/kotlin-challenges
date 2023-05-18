import kotlin.math.sqrt

// Write a function that takes a positive integer as input and returns true if the number is prime
// (only divisible by 1 and itself), and false otherwise.

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false

    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }

    return true
}
