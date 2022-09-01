import java.util.Arrays

fun main() {
    var school = listOf<String>("pencil","eraser", "folder", "notebook", "chromebook", "headphones", "calculator")

    println("Supplies for school: ")
    for(placeholder in school){
        println("${placeholder}")
    }
}