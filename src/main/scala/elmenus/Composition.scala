package elmenus

/**
  * Created by john on 5/2/18.
  */
object Composition {

  def square(x: Int): Int = {
    x * x
  }

  def inc(x: Int): Int = {
    x + 1
  }

  def compose(f: Int=>Int, g: Int=>Int):(Int => Int) =  {
    f andThen(g)
  }

  def main(args:Array[String]): Unit = {
      println(compose(inc, square)(6))
  }
}
