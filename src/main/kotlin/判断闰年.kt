fun isLeapYear(year: Int): Boolean {
    var isLeapYears: Boolean
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        isLeapYears = true
    } else {
        isLeapYears = false
    }
    return isLeapYears
}

fun main(args: Array<String>) {
    println(isLeapYear(2017))
    println(isLeapYear(2020))
}
