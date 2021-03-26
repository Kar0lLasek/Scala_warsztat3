import Loops.{ForeachLoops, Ranges, StandardLoops}
import org.scalatest.FunSuite

class LoopsTest extends FunSuite  {
  test("Loops.StandardLoops") {
    val start = 1
    val stop = 6
    val jump = 2
    // 1, 2, 3, 4, 5, 6
    assert(StandardLoops.standardForWithTo(start, stop) === 21)
    // 1, 2, 3, 4, 5
    assert(StandardLoops.standardForWithUntil(start, stop) === 15)
    // 1, 3, 5
    assert(StandardLoops.standardForWithUntilAndBy(start, stop, jump) === 9)
    // 3, 6
    assert(StandardLoops.standardForWithToAndIf(start, stop) === 9)
    //////////////////////////////////
    var vec = Vector(1,2,3,4,5,6)
    val vecFromFunction0 = StandardLoops.getValuesFromStandardForWithToAndYield(start, stop, 0)
    val vecFromFunction1 = StandardLoops.getValuesFromStandardForWithToAndYield(start, stop, 1)
    assert(vecFromFunction0 === vec)
    assert(vecFromFunction0.size === vec.size)
    assert(vecFromFunction0.size === vecFromFunction1.size)
    vec = for(v <- vec) yield v - 1
    assert(vecFromFunction1 === vec)
    assert(vecFromFunction1.size === vec.size)
  }

  test("Loops.ForeachLoops") {
    val list = List(1,2,3,4,5,6)

    assert(ForeachLoops.getSumOfListWithStandardFor(list) === ForeachLoops.getSumOfListWithForeach(list))
    assert(ForeachLoops.getSumOfListWithStandardFor(list) === 21)
    assert(ForeachLoops.getSumOfListWithForeach(list) === 21)
    assert(list.sum == ForeachLoops.getSumOfListWithForeach(list))
    assert(list.sum == ForeachLoops.getSumOfListWithStandardFor(list))
  }

  test("Loops.Ranges") {
    val start = 1
    val stop = 6
    val jump = 2
    var range = Range(start, stop + 1)
    assert(range === Ranges.getRangeIntStartToStop(start, stop))
    range = Range(start, stop)
    assert(range === Ranges.getRangeIntStartUntilStop(start, stop))
    range = Range(start, stop + 1, jump)
    assert(range === Ranges.getRangeIntStartToStopByJump(start, stop, jump))
    val lowerCaseCharArray = Array('b', 'c', 'd', 'e')
    assert(lowerCaseCharArray === Ranges.getArrayRangeCharStartToStop('b', 'e'))
    val lowerCaseCharSeq = Seq('b', 'c', 'd', 'e')
    assert(lowerCaseCharSeq === Ranges.getRangeSeqStartToStop('b', 'e'))
    val lowerCaseCharList = List('b', 'c', 'd', 'e')
    assert(lowerCaseCharList === Ranges.getRangeListStartToStop('b', 'e'))
    println(lowerCaseCharArray.mkString("Array(", ", ", ")"))
    println(lowerCaseCharSeq)
    println(lowerCaseCharList)
    assert(lowerCaseCharArray === lowerCaseCharSeq) //???????? xD
    assert(lowerCaseCharArray === lowerCaseCharList) //???????? xD
    assert(lowerCaseCharSeq === lowerCaseCharList) //???????? xD
  }
}
