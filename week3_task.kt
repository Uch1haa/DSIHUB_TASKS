
fun main() {
    //To print each number from 1 to 100
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else {
            //multiple of 3
            if (i % 3 == 0) {
                println("Fizz")
            } else {
                //Multiple of 5
                if (i % 5 == 0) {
                    println("Buzz")
                } else {
                    println(i)
                }
            }
        }


    }
    var str: String = "Good food"

    var reverse = reverse(str)
    println(reverse)
}
//The reverse of a string
fun reverse(str: String): String {
    var reverse = ""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]

    }
    return reverse

}



