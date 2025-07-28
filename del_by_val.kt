fun removeAllOccurrences(arr: ArrayList<Int>, toRemove: Int): ArrayList<Int> {
    arr.removeAll {
        it == toRemove
    }
    return arr
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
else{
    println("element not found")
}
    println(arr.toString())
}
