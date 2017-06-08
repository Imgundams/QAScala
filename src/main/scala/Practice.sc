//mapping
val colors = Map("red" -> "best", "azure" -> "notSoBlue", "yellow" -> "ok")

val nums: Map[Int, Int] = Map()

println("Keys in colors : " + colors.keys)
println("Values in colors : " + colors.values)
println("Check if colors is empty : " + colors.isEmpty)
println("Check if nums is empty : " + nums.isEmpty)
colors.keys.foreach(i => print(i + " is " + colors(i)))