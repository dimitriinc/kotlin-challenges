// Write a function that takes a string as input and returns true if the string is a palindrome
// (reads the same forwards and backwards), and false otherwise.

fun isPalindrome(str: String): Boolean {
    val reversedStr = str.reversed()
    return str == reversedStr
}