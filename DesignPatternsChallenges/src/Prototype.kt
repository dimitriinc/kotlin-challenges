// Create an Animal interface with a clone() method. Implement concrete classes Dog and Cat that
// implement the Animal interface and provide their own clone behavior. Demonstrate cloning by creating a few instances
// of each animal and cloning them to obtain new instances.

interface Animal {
    val color: String
    fun makeSound()
    fun clone(color: String): Animal
}

class Dog(
    override val color: String
) : Animal {
    override fun makeSound() {
        println("woof")
    }
    override fun clone(color: String) = Dog(color)
}

class Cat(
    override val color: String
) : Animal {
    override fun makeSound() {
        println("meow")
    }
    override fun clone(color: String) = Cat(color)
}

// Prototype incorporated into Kotlin
data class Horse(
    val color: String
) {
    val legs = 4
    fun makeSound() {
        println("neigh")
    }
}