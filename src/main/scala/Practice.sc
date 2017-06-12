
val x = new Rat(1, 3)
val y = new Rat(5, 7)
val z = new Rat(3, 2)
x.num
x.den
x.+(y)
y.+(y)


class Rat(x: Int, y: Int) {
  require(y != 0, "must be nonzero")


  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a%b)

  private val g = gcd(x, y)

  def this(x: Int) = this(x, 1)

  def num = x / g

  def den = y / g

  def <(that: Rat) = num * that.den < that.num * den

  def max(that: Rat) = if (this < that) that else this

  def +(that: Rat): Unit =
    new Rat(
      num * that.den + that.num * den,
      den * that.den
    )

  def unary_- : Rat = new Rat(-num, den)

  def -(that: Rat) = this + -that
  override def toString = f"$num/$den"
}