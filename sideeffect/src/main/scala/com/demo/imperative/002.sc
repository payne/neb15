import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormatter
import org.joda.time.format.DateTimeFormat

// Create new date, yr, mon, day, hr, min, sec, ms
val myDate = new DateTime(2015, 3, 19, 0, 0, 0, 0)

// Date calculations
val oneMonthLater = myDate.plusMonths(1)
val twoMonthsBefore = myDate.minusMonths(2)

println(myDate.toString("yyyy-MM-dd"))

