package scalademo

class LenghthEncoder {
  def runlengthEncode(s: String): String = {
    if (s == null || s.length() == 0)
      return ""

    var count = 1;
    var encoded = "" + s(0)

    for (i <- 1 to s.length() - 1) {
      if (encoded.last == s(i))
        count += 1
      else {
        encoded += count
        encoded += s(i)
        count = 1
      }
    }
    encoded+=count
    encoded
  }

  def runlengthDecode(s: String): String = {
    if (s == null || s.length() == 0)
      return ""
    var x = s
    val p = "([0-9]*)".r
    var decoded = ""

    while(x!="") {
      var h = (p findFirstIn x) match {
        case Some(i) => i
        case _       => ""
      }
      if(h=="") {
        decoded += x.head
        x = x.drop(1)
      } else {
        decoded += (decoded.last.toString()*(h.toInt-1))
        x = x.drop(h.length())
      }

    }
    decoded
  }

}

object LenghthEncoder {
  def main(args: Array[String]) {
    val l = new LenghthEncoder()
    val s = "aaaaaaaaaabbbaxxxxyyyzyxx"
    val encoded = l.runlengthEncode(s)
    println("String: "+s)
    println("encoded: "+encoded)
    println("decoded correctly: "+(s==l.runlengthDecode(encoded)))

    val s1 = "ccccccgtttaaaatttccggttaaaaaccccccccccgtca"
    val encoded1 = l.runlengthEncode(s1)
    println("String: "+s1)
    println("encoded: "+encoded1)
    println("decoded correctly: "+(s1==l.runlengthDecode(encoded1)))
  }
}