import java.lang.RuntimeException
import java.util.*

abstract class Plant {
    abstract val name: String
    abstract fun grow()
    abstract fun flower()
}

abstract class Garden {
    val plants: MutableList<Plant> = mutableListOf()
}

class MyGarden : Garden()

class MapleTree : Plant() {
    override val name = "Maple tree"
    override fun grow() {
        println("Maple tree is growing")
    }

    override fun flower() {
        println("Maple tree is flowering")
    }
}

class Lilac : Plant() {
    override val name = "Lilac"
    override fun grow() {
        println("Lilac is growing")
    }

    override fun flower() {
        println("Lilac is flowering")
    }
}

class AbstractFactory {

    companion object {
        fun createPlant(name: String): Plant {
            return when (name.lowercase(Locale.CANADA)) {
                "lilac" -> Lilac()
                "maple" -> MapleTree()
                else -> throw RuntimeException("Unknown plant $name")
            }
        }
        fun createGarden(plants: List<Plant>): Garden {
            val garden = MyGarden()
            for (plant in plants) {
                garden.plants += plant
            }
            return garden
        }
    }

}
