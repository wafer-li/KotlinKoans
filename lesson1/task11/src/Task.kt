import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(o1: Int?, o2: Int?) =
            if (o1 == null) 1
            else if (o2 == null) -1
            else if (o1 > o2) -1
            else if (o1 < o2) 1
            else 0
    })
    return arrayList
}