fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = list.filter { it % 2 == 0 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(toRemoveSet)
    println(set) // Output: [1, 3, 5]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val keysToRemove = map.filter { it.key % 2 == 0 }.map { it.key }.toSet()
    map.keys.removeAll(keysToRemove)
    println(map) // Output: {1=one, 3=three, 5=five}
}