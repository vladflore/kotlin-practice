import java.io.File

fun main(){

  val fileName = "words_sequence.txt"
  val words = File(fileName).readLines()
  var maxLength = 0
  words.forEach {
   if (it.length > maxLength) {
       maxLength = it.length
     }
  }
  println(maxLength)
}
