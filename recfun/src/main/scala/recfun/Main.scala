package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    //balance(")()((0 ".toList)

    //println(countChange(300,List(5,10,20,50,100,200,500)))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {

      c match {
        case 0 =>  1
        case _ if(c == r) =>  1
        case _ => (pascal(c - 1, r - 1) + pascal(c, r - 1))
      }
      }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      var oP = 0
      def find(chars: List[Char]): Boolean = {

        if(chars.nonEmpty) {
          chars.head match {
            case '(' => oP += 1; find(chars.tail)
            case ')' => oP -= 1; find(chars.tail)
            case _ if chars.isEmpty => println("List Empty")
            case _ => find(chars.tail)
          }
        }

        if (oP == 0) {
          println("True")
          true
        }
        else {
          println("False")
          false
        }
        }
      find(chars)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    money match {
      case _ if(coins.isEmpty) => 0
      case _ if(money - coins.head ==0) => 1
      case _ if(money - coins.head < 0) => 0
      case _  => countChange(money - coins.head, coins) +
                  countChange(money, coins.tail)
    }
  }

}
/*   Pseudocode
def countChange( n, m ):
    if n == 0:
        return 1
    if n < 0:
        return 0
    if m <= 0 and n >= 1:
        return 0

    return count( n, m - 1 ) + count( n - S[m], m )
 */
