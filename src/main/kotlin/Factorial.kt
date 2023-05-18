import java.math.BigInteger

// Write a recursive function to calculate the factorial of a given number.

fun calculateFactorial(num: Int): BigInteger {
    return if (num == 0 || num == 1) BigInteger.ONE
    else BigInteger.valueOf(num.toLong()) * calculateFactorial(num - 1)
}