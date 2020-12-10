package introduction

/**
 * @author huzihao
 * @since 2020/12/9 01:09
 */
object TopStock extends App {
  case class Record(year: Int, month: Int, date: Int, closePrice: BigDecimal)

  def getYearEndClosingPrice(symbol: String, year: Int): BigDecimal = {
    val url = s"https://raw.githubusercontent.com/ReactivePlatform/" +
      s"Pragmatic-Scala-StaticResources/master/src/main/resources/" +
      s"stocks/daily/daily_$symbol.csv"

    val data = io.Source.fromURL(url).mkString
    val maxClosePrice = data.split("\n")
      .filter(record => record.startsWith(s"$year-12"))
      .map(record => {
        val Array(timestamp, open, high, low, close) = record.split(",")
        val Array(year, month, date) = record.split("-")
        Record(year.toInt, month.toInt, date.toInt, BigDecimal(close.trim))
      })
      .sortBy(_.date)(Ordering[Int].reverse)
      .take(1)
      .map(_.closePrice)
      .head
    maxClosePrice
  }

  val symbols = List("AMD", "AAPL", "AMZN", "IBM", "ORCL", "MSFT")
  val year = 2017

  val (topStock, topPrice) =
    symbols.map { ticker => (ticker, getYearEndClosingPrice(ticker, year)) }
      .maxBy { stock => stock._2 }

  printf(s"Top stock of $year is $topStock closing at price $topPrice%n")
}
