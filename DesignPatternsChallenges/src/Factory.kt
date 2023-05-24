import java.lang.RuntimeException
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

// Create a Shape interface with a draw() method, and three concrete classes Circle, Rectangle, and Triangle that
// implement the Shape interface. Create a ShapeFactory class with a method createShape(shapeType: String) that
// returns the corresponding shape object based on the provided shape type. Demonstrate the usage of the factory
// to create different shapes.

fun convertToTwoDecimalString(double: Double) = String.format("%.2f", double)

interface Shape {
    val perimeter: Double
    val area: Double
    fun draw(): String
}

data class Circle(
    val radius: Double, // in cm
    override val perimeter: Double = 2 * PI * radius,
    override val area: Double = PI * radius.pow(2.0),
) : Shape {
    override fun draw() = "Drawing a circle with the perimeter of ${convertToTwoDecimalString(perimeter)} cm and area of ${convertToTwoDecimalString(area)} cm^2"
}

data class Rectangle(
    val length: Double,
    val width: Double,
    override val perimeter: Double = 2 * (length + width),
    override val area: Double = length * width,
) : Shape {
    override fun draw() = "Drawing a rectangle with the perimeter of ${convertToTwoDecimalString(perimeter)} cm and area of ${convertToTwoDecimalString(area)} cm^2"
}

data class Triangle(
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    override val perimeter: Double = sideA + sideB + sideC,
    override val area: Double = lazy {
        val semi = perimeter / 2
        sqrt(semi * (semi - sideA) * (semi - sideB) * (semi - sideC))
    }.value
) : Shape {
    override fun draw() = "Drawing a triangle with the perimeter of ${convertToTwoDecimalString(perimeter)} cm and area of ${convertToTwoDecimalString(area)} cm^2"
}

class ShapeFactory {
    fun createShape(shapeType: String): Shape {
        return when (shapeType) {
            "circle" -> Circle(2.5)
            "rectangle" -> Rectangle(4.0, 2.0)
            "triangle" -> Triangle(3.3, 4.2, 5.1)
            else -> throw RuntimeException("Unknown shape: $shapeType")
        }
    }
}