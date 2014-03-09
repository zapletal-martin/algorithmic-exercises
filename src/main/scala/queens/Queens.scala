package main.scala.queens

/*
place N queens on N*N board without them attacking each other.
example taken from M. Odersky's Programming in Scala
 */

object Queens {
    def queens (n : Int): List[List[(Int, Int)]]  = {
        def placeQueens(k : Int) : List[List[(Int, Int)]] = {
            if (k == 0)
                List(List())
            else
                for {
                    queens <- placeQueens(k - 1)
                    column <- 1 to n
                    queen = (k, column)
                    if isSafe(queen, queens)
                } yield queen :: queens
        }

        def isSafe(q1 : (Int, Int), queens : List[(Int, Int)]) = {
            def SameRow(q1: (Int, Int), q2: (Int, Int)): Boolean = {
                q1._1 == q2._1
            }

            def SameColumn(q1: (Int, Int), q2: (Int, Int)): Boolean = {
                q1._2 == q2._2
            }

            def SameDiagonal(q1: (Int, Int), q2: (Int, Int)): Boolean = {
                Math.abs(q1._1 - q2._1) == Math.abs(q1._2 - q2._2)
            }

            queens.forall(queen => !SameRow(q1, queen) && !SameColumn(q1, queen) && !SameDiagonal(q1, queen))
        }

        placeQueens(n)
    }
}
