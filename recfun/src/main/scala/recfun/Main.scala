package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 15) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }


    balance(":-)".toList)

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0 || c == r) 1
      else pascal(c - 1, r - 1) +
        pascal(c, r - 1)
      }

  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def find(chars: List[Char], open: Int): Boolean = {

        var oP = open

        chars.head match {
          case '(' => oP += 1
          case ')' => oP -= 1
          case _ => if(chars.tail.isEmpty){}
          case _ => find(chars.tail, oP)
      }
        if (open == 0) {
          println("true")
          true
        }
        else {
          println("false")
          false
        }
      }
      find(chars,0)
    }


  
  /**
   * Exercise 3
   */
    //def countChange(money: Int, coins: List[Int]): Int = ???

  }
