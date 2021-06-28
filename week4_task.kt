fun main(){
    println(evenlySpaced(3,4,6))

}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean{
    var e = a - b
    var f = b - c
    return (e == f)


}

