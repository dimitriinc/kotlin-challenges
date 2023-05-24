import java.lang.Exception

fun executeSingleton() {
    Logger.log("Hello")
}

fun executeFactory() {
    val factory = ShapeFactory()
    val circle = factory.createShape("circle")
    println(circle.draw())
    val rectangle = factory.createShape("rectangle")
    println(rectangle.draw())
    val triangle = factory.createShape("triangle")
    println(triangle.draw())
    try {
        val hexagon = factory.createShape("hexagon")
        println(hexagon.draw())
    } catch (e: Exception) {
        println(e.message)
    }
}

fun executeBuilder() {
    try {
        val person = Person.Builder()
            .setFirstName("Tony")
            .setLastName("Soprano")
            .setAge(45)
            .setAddress("North Caldwell, New Jersey")
            .build()
        println(person)
    } catch (e: Exception) {
        println(e.message)
    }
}

fun executePrototype() {
    val cat1 = Cat("brown")
    val cat2 = cat1.clone("black")
    println(cat2.color)
    cat2.makeSound()

    val horse1 = Horse("white")
    val horse2 = horse1.copy(color = "black")
    horse2.makeSound()
    println(horse2.color)
}

fun executeAbstractFactory() {
    val plantsInGarden = listOf(
        AbstractFactory.createPlant("Lilac"),
        AbstractFactory.createPlant("Maple")
    )
    val garden = AbstractFactory.createGarden(plantsInGarden)
    garden.plants.forEach {
        println("The plant is ${it.name}\n${it.grow()}")
    }
    println(garden.plants)
}

fun main() {
    executeAbstractFactory()
}