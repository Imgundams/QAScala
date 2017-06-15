import scala.collection.mutable.ArrayBuffer
import scala.io.Source

val filename = "C:\\Users\\Administrator\\IdeaProjects\\QAScala\\src\\main\\scala\\InputText.txt"
def fileReader(filepath: String): Array[String] =
  Source.fromFile(filename).getLines().map(w=>w.toLowerCase).map(w => w.sorted).toArray.sortWith(_.length < _.length)
var anagrams = fileReader(filename)

fileReader(filename)

anagrams

/*
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
val words = ListBuffer("what","did","you","say")
def orderTheString(word : String) = word.sortWith(_<_)
var codes =  words.map(x => orderTheString(x))
*/
//words.foreach(words<=words.toCharArray.sorted.mkString)
print(words)

"hello"
*/