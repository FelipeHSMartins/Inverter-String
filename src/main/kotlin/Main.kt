fun main(args: Array<String>) {
    val myString = "Esta é minha string."
    println(myString.invertida())

    // Uma maneira mais fácil em Kotlin seria esta abaixo. Porém, imagino que violaria o propósito do exercício.
    println(myString.reversed())


}

fun String.invertida() : String {
    val temp = mutableListOf<Char>()
    for (caracter in this) {
        temp.add(0, caracter)
    }
    return String(temp.toCharArray())
}