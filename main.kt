fun main() {
    //10 if statements
    var name: String = "uche"
    if (name == "uche")
        println(name)

    var age: Int = 24
    if (age > 19)
        println("senior")

    var age2: Int = 24
    if (age2 < 30)
        println("junior")

    var age3: Int = 10
    if (age3 != 10)
        println("correct")

    var fName: String = "john"
    if (fName != null)
        println("Hello ${fName}")

    var x: Int = 6
    var y: Int = 5
    if (x > y) {
        println(x)
    } else {
        println(y)

    }
    var str = "Hello!"
    if (str.length == 0) {
        print("The string is empty!")
    } else if (str.length > 5) {
        print("The string is short!")
    } else {
        print("The string is long!")
    }

    var studentScore: Array<Int> = arrayOf(20, 50, 70, 90, 40)
    var resultScore: Array<Int> = arrayOf(70, 80, 90, 30, 50)
    if (studentScore[2] > resultScore[4]) {
        println("excellence")

    } else {
        println("Good")

    }
    var n: Int = 6
    var u: String = "Jane"
    if(n in 3..5){
        println("You Win")
    }
    if(n == 6) {
        n += 10
        println(n)
    }

    //5 when expression keyword
    var boyNames: String = "chuks"
    var result: String = when {
        boyNames == "uche" -> "Mobile app dev"
        boyNames == "chuks" -> "web developer"
        boyNames == "paul" -> "instructor"
        boyNames == " samuel" -> "ui/ux"
        else -> "Not a valid name"
    }
    println(result)

    var lang: String = ""
    var langCheck: String = when {
        lang == "English" -> "How are you?"
        lang == "German" -> "Wie geht es dir?"
        else -> "I don't know that language yet"
    }
    println(langCheck)

    var nums: String = "first number"
    var numCheck: Int = when {
        nums == "first number" -> 1
        nums == "second number" -> 2
        nums == "third number" -> 3
        nums == "fourth number" -> 4
        nums == "fifth number" -> 5

        else -> 6
    }
    println(numCheck)

    //loop to print out 1 - 100
    var countNum: Int = 1
    while (countNum < 101) {
        println(countNum)
        countNum += 1

    }
    //Loop that prints out 1-10 without 4 & 5

    for (i in 1..10) {
        if (i == 4) {
            continue
        }
        if (i == 5) {
            continue
        }
        println(i)

    }
//Loop that outputs even numbers from 10-20 and outputs odd numbers from 20-30
    var i: Int = 10
    var s: Int = 20
    while (i <= 20) {
        if (i % 2 == 0) {
            println(i)
        }
        i++
        if (s % 2 == 1) {
            println(s)
        }
        s++
    }


}