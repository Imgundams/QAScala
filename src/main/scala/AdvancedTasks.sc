
import scala.io.Source

val filename = "C:\\Users\\Administrator\\IdeaProjects\\QAScala\\src\\main\\scala\\InputText.txt"
def fileReader(filepath: String): Array[String] = Source.fromFile(filename).getLines().map(w => w.toLowerCase).map(w => w.sorted).toArray.sortWith(_.length < _.length)

def stringArraySorter(longString: String): Array[String] =  longString.split("\n").map(w => w.toLowerCase).map(w => w.sorted).sortWith(_.length < _.length)

def identicalKeeper(arrayOfStrings:Array[String]):Array[String]= arrayOfStrings.diff(arrayOfStrings.distinct)

var anagrams = fileReader(filename)

identicalKeeper(anagrams)

def anagramOutputted(sortedString:String):Unit={}
