package ArraysAndCollections

object Arrays {
  def getSumOfArrayWithForeach(list: Array[Int]): Int = {
    var sum = 0
    list.foreach(sum += _)
    sum
  }

  def getValuesToStringFromArray(list: Array[Int]): String = {
    var names = ""
    list.foreach(names += _.toString)
    names
  }
}
