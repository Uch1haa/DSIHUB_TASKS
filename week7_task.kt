fun main(){
    val list: List<Int> = listOf(1,2,3,4,5)
    println(reverse(list))

}
fun reverse(list: List<Int>): List<Int>{
    val num: ArrayList<Int> = arrayListOf<Int>()
    for (i: Int in 0 until list.size - 1){
        val number: Int = list[list.size - 1 - i]
        num.add(number)
    }
    return num
}