// Write a function that takes a string as input and returns true if all characters in the string are
// unique (no repeated characters), and false otherwise.

fun hasUniqueCharacters(word: String): Boolean {
    val characters = mutableMapOf<Char, Int>()
    for (char in word) characters[char] = characters.getOrDefault(char, 0) + 1
    for (count in characters.values) {
        if (count > 1) return false
    }
    return true
}

fun hasUniqueCharactersAlt(word: String): Boolean {
    val charSet = HashSet<Char>()
    for (char in word) {
        if (charSet.contains(char)) return false
        charSet.add(char)
    }
    return true
}