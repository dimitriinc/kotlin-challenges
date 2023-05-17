// Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz"
// instead of the number, and for the multiples of five, print "Buzz". For numbers that are multiples
// of both three and five, print "FizzBuzz".

fun runFizzBuzz() {
    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}