def characterMap[T](input: T): String = input match {
  case ".-" => "a"
  case "-..." => "b"
  case "-.-." => "c"
  case "-.." => "d"
  case "." => "e"
  case "..-." => "f"
  case "--." => "g"
  case "...." => "h"
  case "src/main" => "i"
  case ".---" => "j"
  case "-.-" => "k"
  case ".-.." => "l"
  case "--" => "m"
  case "-." => "n"
  case "---" => "o"
  case ".--." => "p"
  case "--.-" => "q"
  case ".-." => "r"
  case "..." => "s"
  case "-" => "t"
  case "..-" => "u"
  case "...-" => "v"
  case ".--" => "w"
  case "-..-" => "x"
  case "-.--" => "y"
  case "--.." => "z"
  case "/" => " "
  case _ => "ech"
}


def morseInput (input:String): Unit = {
  var array = input.split(" ")
  for (i <- 0 until array.length) {
    print(characterMap(array(i)))
  }
}


morseInput(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.-- /")

