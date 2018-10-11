package scalademo

object Factorial {
  def apply(n: Integer): Integer = {
    if (n==0)
      1
    else
      n * apply(n-1)
  }

  def main(args: Array[String]) {
    (0 to 9).map(i=>Factorial(i)).foreach(println)
  }
}
