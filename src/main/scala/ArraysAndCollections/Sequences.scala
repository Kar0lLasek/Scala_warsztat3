package ArraysAndCollections

object Sequences {
  def getSumOfSeqWithForeach(seq: Seq[Int]): Int = {
    var sum = 0
    seq.foreach(sum += _)
    sum
  }

  def getValuesToStringFromSeq(seq: Seq[Int]): String = {
    var names = ""
    seq.foreach(names += _.toString)
    names
  }
}
