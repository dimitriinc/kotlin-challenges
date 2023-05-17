// Write a function that takes two strings as input and returns true if the two strings are anagrams
// (contain the same characters in a different order), and false otherwise.

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    // Base data structure, contains the chars from str1 and their counts
    val charCount = mutableMapOf<Char, Int>()

    // Count all the chars in str1
    for (char in str1) charCount[char] = charCount.getOrDefault(char, 0) + 1

    // For every char in str2 remove one count from the base data structure
    for (char in str2) {
        if (charCount.containsKey(char)) {
            charCount[char] = charCount[char]!! - 1
            if (charCount[char] == 0) charCount.remove(char)
        } else {
            return false
        }
    }
    return charCount.isEmpty()
}