fun main(){
    println(removeVowels("kotlin Programming Language"))

}
fun removeVowels(a: String): String{
    val remove = StringBuilder()

    for (c in a){
        if(c != 'a'&& c != 'A' && c != 'e' && c != 'E' && c !='i' && c != 'I' && c != 'o' && c != 'O' && c !='u' && c != 'U')
        {
            remove.append(c)
        }
    }
    return remove.toString()
}