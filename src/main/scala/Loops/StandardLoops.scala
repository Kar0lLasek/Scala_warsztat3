package Loops

object StandardLoops {
  def standardForWithTo(start: Int, stop: Int): Int = {
    var sum = 0
    for (i <- start to stop) {
      sum += i
    }
    sum
  }

  def standardForWithUntil(start: Int, stop: Int): Int = {
    var sum = 0
    for (i <- start until stop) {
      sum += i
    }
    sum
  }

  def standardForWithUntilAndBy(start: Int, stop: Int, jump: Int): Int = {
    var sum = 0
    for (i <- start until stop by jump) {
      sum += i
    }
    sum
  }

  def standardForWithToAndIf(start: Int, stop: Int): Int = {
    var sum = 0
    for (i <- start to stop if i % 3 == 0) {
      sum += i
    }
    sum
  }

  def getValuesFromStandardForWithToAndYield(start: Int, stop: Int, subtraction: Int): IndexedSeq[Int] = {
    for (i <- start to stop) yield i - subtraction
  }

  def whileFunction(stop: Int): Int = {
    var counter = 0
    while (counter < stop) {
      counter += 1
    }
    counter
  }

  def doWhileFunction(stop: Int): Int = {
    var counter = 0
    do {
      counter += 1
    } while (counter < stop)
    counter
  }
}
