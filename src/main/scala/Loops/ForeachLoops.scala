package Loops

object ForeachLoops {
  def getSumOfListWithStandardFor(list: List[Int]): Int = {
    var sum = 0
    for (i <- list) {
      sum += i
    }
    sum
  }

  def getSumOfListWithForeach(list: List[Int]): Int = {
    var sum = 0
    list.foreach(sum += _)
    sum
  }

  def getAllNamesFromList(list: List[String]): String = {
    var names = ""
    list.foreach(names += _ + "\n")
    names
  }
}
