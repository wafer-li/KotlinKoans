import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

data class SeveralTimeInterval(val timeInterval: TimeInterval, val n: Int)

operator fun TimeInterval.times(n: Int): SeveralTimeInterval = SeveralTimeInterval(this, n)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(severalTimeInterval: SeveralTimeInterval): MyDate {
    val (timeInterval, n) = severalTimeInterval

    return addTimeIntervals(timeInterval, n)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}