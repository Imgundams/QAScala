import scala.collection.mutable.ArrayBuffer
import scala.io.Source

val filename = "C:\\Users\\Administrator\\IdeaProjects\\QAScala\\src\\main\\scala\\InputText.txt"
def fileReader(filepath: String): Array[String] = Source.fromFile(filename).getLines.toArray.sortBy(-_.size)
var anagrams = fileReader(filename)
fileReader(filename)

def wordSplitter(words: String): String = {
  words.toCharArray.sorted
  var arrayOfLetters = ArrayBuffer[Char]()
  for (split <- words) arrayOfLetters += split
  arrayOfLetters.sorted.mkString
}
wordSplitter("Hello")

"hello".toCharArray.sorted
var arrayOfLetters = ArrayBuffer[Char]()
for (split <- "Hello") arrayOfLetters += split
arrayOfLetters.sorted

var bool:Boolean = 'g'>'a'

//def doIt(words: Array[String]): String ={




var words = fileReader(filename)



/*while (i < words.length){
  i = i+1
  print(words(i).toCharArray.sorted.mkString)
}
*/
//words.foreach(words<=words.toCharArray.sorted.mkString)
print(words)

"hello"