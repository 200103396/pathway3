package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish() {
    override val color = "grey"
}

class Plecostomus: AquariumFish() {
    override val color = "gold"
}