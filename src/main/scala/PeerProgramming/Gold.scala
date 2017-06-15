package PeerProgramming

/**
  * Created by Administrator on 14/06/2017.
  */
object Gold {
  def goldilocks(string: String): Unit = {
    val head = string.split("\n").head
    val tail = string.split("\n").tail
    for (i <- 0 until tail.length) {
      if ((tail(i).split(" ")(0).toInt >= head.split(" ")(0).toInt)
        && (tail(i).split(" ")(1).toInt <= head.split(" ")(1).toInt)) {
        println(i + 1)
      }
    }
  }
  val string: String = "100 80\n30 50\n130 75\n90 60\n150 85\n120 70\n200 200\n110 100"
}