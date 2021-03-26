import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
  }

  test("CubeCalculator.square") {
    assert(CubeCalculator.square(3) === 9)
    assert(CubeCalculator.square(0) === 0)
  }
}