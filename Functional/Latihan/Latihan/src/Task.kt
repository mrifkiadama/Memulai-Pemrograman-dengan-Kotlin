fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    val cetak = with(text){
        "$firstChar latter is ${this[0.toString()]}" +
                "and ${this[5.toString()]} for $lastChar  second letter"
    }
    println(cetak)

}

// TODO 1
fun String.getFirstAndLast() = mapOf<String, Char>()