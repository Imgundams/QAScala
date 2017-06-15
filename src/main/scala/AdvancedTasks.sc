def lcs(string1:String,string2:String):Unit={
  var a = Array(string1,string2)
}
function LCSLength(X[1..m], Y[1..n])
C = array(0..m, 0..n)
for i := 0..m
C[i,0] = 0
for j := 0..n
C[0,j] = 0
for i := 1..m
for j := 1..n
if X[i] = Y[j]
C[i,j] := C[i-1,j-1] + 1
else
C[i,j] := max(C[i,j-1], C[i-1,j])
return C[m,n]



/*import scala.io.Source

val filename = "C:\\Users\\Administrator\\IdeaProjects\\QAScala\\src\\main\\scala\\InputText.txt"
def fileReader(filepath: String): Array[String] = Source.fromFile(filename).getLines().map(w => w.toLowerCase).map(w => w.sorted).toArray.sortWith(_.length < _.length)

def stringArraySorter(longString: String): Array[String] =  longString.split("\n").map(w => w.toLowerCase).map(w => w.sorted).sortWith(_.length < _.length)

def identicalKeeper(arrayOfStrings:Array[String]):Array[String]= arrayOfStrings.diff(arrayOfStrings.distinct)

var anagrams = fileReader(filename)

identicalKeeper(anagrams)

def anagramOutputted(sortedString:String):Unit={}
*/