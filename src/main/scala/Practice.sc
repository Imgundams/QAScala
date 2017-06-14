import scala.collection.mutable.ArrayBuffer
var bang: (String,Boolean) = ("hello",true)


var buf = ArrayBuffer(55,"string",51,"thread",bang)

buf -= bang
val notBang = (bang._1,false)

buf += notBang

println(buf.mkString(" "))
