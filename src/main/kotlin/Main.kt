import java.util.Scanner

fun main() {
    val scn = Scanner(System.`in`)
    println("Enter the size:")
    var size = scn.nextInt()

    val myList = mutableListOf<String>()
    scn.nextLine()

    while (size > 0) {
        println("enter list inputs:")
        val inputs = scn.nextLine()
        myList.add(inputs)
        size--
    }

    val filteredValuesM= myList.filter { it.contains("m") }
    val filteredValuesA= myList.filter { it.contains("a" ) }

   println( filteredValuesM.toString().uppercase())
   println(filteredValuesA.toString().uppercase())
}




