package spark.readText

import org.apache.log4j.{Level, Logger}
import org.apache.spark.SparkContext

object ScalaSparkTextDemo {
  def main(args: Array[String]) = {
    // Only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    // Create a spark context using every core of the local machine, named ''
    val sc = new SparkContext("local[*]", "ScalaSparkTextDemo")

    val lines = sc.textFile("src/main/resources/README.md")


    println(lines.count())
  }
}

