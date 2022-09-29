import java.io.File

fun main(){

  val fileName = "text.txt"
  val words = File(fileName).readText().split(" ")
  println(words.size)
}
