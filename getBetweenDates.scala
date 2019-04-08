object Test {

  def generateBetweenDates(start: String, end: String): ListBuffer[String] = {
    var startDate = LocalDate.parse (start)
    var endDate = LocalDate.parse (end)
    val totalDates = new ListBuffer[String] ()

    while (! startDate.isAfter(endDate)  ) {
      totalDates.append (startDate.toString)
    startDate = startDate.plusDays (1)

  }
  }
