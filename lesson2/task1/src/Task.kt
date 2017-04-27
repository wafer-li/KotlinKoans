data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int =
        if (year > other.year) 1
        else if (year < other.year) -1
        else {
            if (month > other.month) 1
            else if (month < other.month) -1
            else {
                if (dayOfMonth > other.dayOfMonth) 1
                else if (dayOfMonth < other.dayOfMonth) -1
                else 0
            }
        }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2