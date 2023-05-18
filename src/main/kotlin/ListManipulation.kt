// Write a function that takes a list of integers and returns a new list containing only the even numbers
// from the original list.

fun evenOutList(integers: List<Int>): List<Int> {
    return integers.filter { it % 2 == 0 }
}