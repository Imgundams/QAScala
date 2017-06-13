object id2 {
  private val clockticker = new java.util.concurrent.atomic.AtomicInteger
  def unique: Int = clockticker.getAndIncrement + 1
}

object damageValue {
  private val random = scala.util.Random
  def randomInt: Int = random.nextInt()
}


damageValue.randomInt
damageValue.randomInt
damageValue.randomInt
damageValue.randomInt
damageValue.randomInt


