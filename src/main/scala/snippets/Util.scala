package snippets

object Util {

  def isPrimeNumber(num: Int): Boolean = {
    return num > 1 && (for (i <- 2 to (num - 1) if num % i == 0) yield i).size == 0
  }

}