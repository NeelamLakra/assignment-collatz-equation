package edu

package object knoldus {

  def collatzEquation(list: List[Int],secondlist: List[Int], number: Int): List[Int] = {
    def equation(list: List[Int], input: Int): Boolean = {
      list match {
        case head :: tail if (head != input) => equation(tail, number)
        case head :: tail if (head == input) => true
        case head :: Nil if (head != input) => false
        case _ =>    false
      }
    }

    equation(list, number) match {
      case true => secondlist

      case false => {
        number % 2 match {
          case 0 => collatzEquation( list,number / 2 :: secondlist ,number / 2)
          case 1 => collatzEquation( list,3 * number + 1::secondlist ,3 * number + 1)
        }
      }
    }
  }
}
