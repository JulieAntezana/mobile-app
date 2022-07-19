import java.util.Scanner

fun main() {
    print("Enter a name: ")
    val name = readLine()!!
    print("Enter an age: ")
    val age = readLine()!!.toInt()
    val border = "`-._,-'"
    val timesToRepeat = 10
    printBorder(border, timesToRepeat)
    println("                      Happy Birthday, " + name + "!")
    printBorder(border, timesToRepeat)
    val age = 62
    val layers = 5
    val plate = 1
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    printCakePlate(age, plate)
}

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}

fun printCakeCandles(age: Int) {
    print ("  ")
    repeat(age) {
          print(",")
    }    
    println() // Print an empty line

    print("  ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }    
    println()
}

fun printCakeTop(age: Int) {
    print(" ") // Print the inset of the cake top on the cake
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        print(" ") // Print the inset of the cake on the plate
        repeat(age + 2) {
            print("@")
        }
        println()
    }  
}

fun printCakePlate(age: Int, plate: Int) {
    repeat(plate) {
        repeat(age + 4) {
            print("#")
        }
        println()
    }  
}