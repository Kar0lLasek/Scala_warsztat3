import org.scalatest.FunSuite
import ArraysAndCollections.Arrays
import ArraysAndCollections.Sequences

class ArraysAndCollectionsTest extends FunSuite{
  test("Collections.Arrays") {
    val array = Array(1,2,3,4,5)
    assert(Arrays.getSumOfArrayWithForeach(array) === 15)
    assert(Arrays.getValuesToStringFromArray(array) === "12345")
  }

  test("Collections.Sequences") {
    val seq = Seq(1,2,3,4,5)
    assert(Sequences.getSumOfSeqWithForeach(seq) === 15)
    assert(Sequences.getValuesToStringFromSeq(seq) === "12345")
  }
}
