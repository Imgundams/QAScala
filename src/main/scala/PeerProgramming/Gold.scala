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



val string :String = "100 80\n30 50\n130 75\n90 60\n150 85\n120 70\n200 200\n110 100"
val inputChallenge:String = "100 120\n297 90\n66 110\n257 113\n276 191\n280 129\n219 163\n254 193\n86 153\n206 147\n71 137\n104 40\n238 127\n52 146\n129 197\n144 59\n157 124\n210 59\n11 54\n268 119\n261 121\n12 189\n186 108\n174 21\n77 18\n54 90\n174 52\n16 129\n59 181\n290 123\n248 132"