fun main(){
    println(lovePetals(3,11))

}
fun lovePetals(flower1: Int, flower2: Int): Boolean{
    if (flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 % 2 == 0)
    {
        return true
    }
    return false
}
