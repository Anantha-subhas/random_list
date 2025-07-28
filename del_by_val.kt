fun removeAllOccurrences(arr: IntArray, toRemove: Int): IntArray {
    return arr.filter { it != toRemove }.toIntArray()
}

fun main(){
val arr = arrayListOf<Int>();

    println("enter the no.of elements")
    val n = readln().toInt()

    repeat(n){
        val value = readln().toInt()
        arr.add(value)
    }

    println(arr.toString())

    // to delete
    println("enter a val to delete")

    val del = readln().toInt()
if(del in arr){
    arr.remove(del)
}
    println(arr.toString())
}
