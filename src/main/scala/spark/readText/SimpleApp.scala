package spark.readText

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.log4j.{Level, Logger}


object SimpleApp extends App {

  Logger.getLogger("org").setLevel(Level.ERROR)

  val sc = new SparkContext(new SparkConf().setAppName("Simple SparkApp").setMaster("local[*]"))

  val rdd = sc.parallelize(Seq(1, 2, 3))

  println(rdd.count())

}
