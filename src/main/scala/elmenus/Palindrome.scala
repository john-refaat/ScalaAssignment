package elmenus

/**
  * Created by john on 5/2/18.
  */
object Palindrome {
  def isPalindrome(word: String): Boolean = {
    if (word == null | word.length() == 1)
      true
    else
      word.head == word.last && isPalindrome(word.tail.dropRight(1))
  }

  def main(args:Array[String]) {
    println("madam: "+isPalindrome("madam"))
    println("mom: "+isPalindrome("mom"))
    println("radar: "+isPalindrome("radar"))
    println("refer: "+isPalindrome("refer"))
    println("wow: "+isPalindrome("wow"))
    println("apple: "+isPalindrome("apple"))
  }
}
