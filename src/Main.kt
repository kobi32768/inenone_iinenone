import kotlin.random.Random

fun main() {
    val text = "いねのねいいねのね"
    var latestStr = ""
    var count = 0

    while (latestStr != text) {
        val rnd = Random.nextInt(0, 9)
        latestStr += text[rnd]
        ++count

        if (latestStr.length > 9)
            latestStr = latestStr.drop(1)

        print(text[rnd])
    }

    println("\nCount: $count")
}
