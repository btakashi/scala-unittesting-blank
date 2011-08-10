package snippets

import org.scalatest.Assertions
import org.scalatest.matchers.ShouldMatchers
import org.junit.Test

/**
 * ScalaTest Assertions Example
 */
class UtilTestWithScalaTestAssertions extends Assertions with ShouldMatchers {

  @Test def isPrimeNumberTest() {
    import snippets.Util._
    val argsAndExpected = List(
      (-4, false),
      (-3, false),
      (-2, false),
      (-1, false),
      (0, false),
      (1, false),
      (2, true),
      (3, true),
      (4, false),
      (5, true),
      (6, false),
      (7, true),
      (8, false),
      (9, false),
      (10, false),
      (11, true),
      (12, false)
    )
    // {@link Assertions#assert(Boolean)}
    argsAndExpected foreach {
      case (arg, expected) => assert(isPrimeNumber(arg) == expected)
    }
    // {@link ShouldMatchers#should(Matcher)}
    argsAndExpected foreach {
      case (arg, expected) => isPrimeNumber(arg) should be(expected)
    }
  }

}