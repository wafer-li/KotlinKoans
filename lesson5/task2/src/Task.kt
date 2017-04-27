import java.util.HashMap

fun buildMap(block: HashMap<Int, String>.() -> Unit): HashMap<Int, String> {
    val hashMap = hashMapOf<Int, String>()
    hashMap.block()
    return hashMap
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}