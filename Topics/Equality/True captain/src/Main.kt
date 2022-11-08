// you do not need to understand how it works, ignore it
data class Pirate(val name: String)

// Do not touch the lines above

fun main() {
    // fix the declaration below
    val captain = Pirate("Hector Barbossa")
    println(captain.name)
    val newCaptain = Pirate("Jack Sparrow")
    println(newCaptain.name)
}