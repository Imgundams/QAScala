package WednesdayExersise

/**
  * Created by Daniel Raineri on 14/06/2017.
  */
object Problem {

  object task1 {
    ////////DOES NOT WORK I COULDN'T FINISH THIS////////
    def doubleChar(stringToDouble: String): String = {
      var arr =
        arr
      for (i <- 0 to arr) {
        arr(i)
        arr(i)
      }
    }
  }

  object task2 {

    def getSandwich(sandwich: String): String = {
      try {
        sandwich.split("bread")(1)
      } catch {
        case e: Exception => ""
      }
    }
  }

  object task3 {

    def evenlySpace(a: Int, b: Int, c: Int): Boolean = {
      (b - a == c - b) || (b - a == a - c) || (b - a == b - c) || (b - a == b - c)
    }
  }

  object task4 {
    ////////DOES NOT WORK I COULDN'T FINISH THIS////////
    def fibonacci(num: Int): Int = {
      def loop(n: Int, prev: Int, now: Int): Int = {
        if (n == 0) 0
        else if (n == 1) 1
        else now + loop(n - 1, now, prev)
      }

      loop(num, 0, 1)
    }

    fibonacci(6)

  }

  object task5 {

    def bunnyEars(wabbitCount: Int): Int = {
      (wabbitCount) match {
        case 0 => 0 // Hunting season is over
        case _ => 2 + bunnyEars(wabbitCount - 1)
      }
    }
  }

  object task6 {
    def nTwice(word: String, n: Int): String = {
      word.substring(0, n).concat(word.substring(word.length - n))
    }
  }

  object task7 {
    def endsLy(word: String): Boolean = {
      (word.substring(word.length - 2) == "ly")
    }
  }

  object task8 {
    ////////DOES NOT WORK I COULDN'T FINISH THIS////////
    def stringClean(jibberish: String): String = {
      def loop(jib: Array[Char]): String = {
        jib.foreach(char => if)
      }

      loop(jibberish.toCharArray)
    }
  }

  object task9 {
    def hardAs(symbolToUse: String, sizeOfDiamond: Int): Unit = {
      def inner(sym: String, s: Int, count: Int, r: Boolean): Unit = {
        print(" " * (s - count))
        if (r == true && count == 0) println("")
        else if (s == count || r == true) {
          print(" ")
          println(sym * ((count * 2) - 1))
          inner(sym, s, count - 1, true)
        }
        else {
          print(" ")
          println(sym * ((count * 2) - 1))
          inner(sym, s, count + 1, r)
        }
      }

      inner(symbolToUse, sizeOfDiamond, 0, false)
    }
  }

  object task10 {
    def hardAsAHollow(symbolToUse: String, sizeOfDiamond: Int): Unit = {
      def inner(sym: String, s: Int, count: Int, r: Boolean): Unit = {
        print(" " * (s - count))
        if (r == true && count == 0) println(" " + sym)
        else if (s == count || r == true) {
          print(" ")
          println(sym + " " * ((count * 2) - 1) + sym)
          inner(sym, s, count - 1, true)
        }
        else if (count == 0) {
          print(" ")
          println(sym + " " * ((count * 2) - 1))
          inner(sym, s, count + 1, r)
        }
        else {
          print(" ")
          println(sym + " " * ((count * 2) - 1) + sym)
          inner(sym, s, count + 1, r)
        }
      }

      inner(symbolToUse, sizeOfDiamond, 0, false)
    }
  }


}

