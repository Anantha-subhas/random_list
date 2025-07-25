import kotlin.random.Random

fun main() {
    val arr = MutableList(50){ Random.nextInt(1, 1001) }
    println("${arr.size}")
    println(arr)

    val randomIndices = MutableList(25) { Random.nextInt(1, 51) - 1 }
    
    val sortedIndices = randomIndices.sortedDescending()
    // when we sort the index in descending order,the array doesn't get shifted
    // because it removes from the back of the list only
    println(sortedIndices)
    println(arr.indices)
    for (index in sortedIndices) {
   //it checks whether the current index is in original arr.indices
   if (index in arr.indices) {
            arr.removeAt(index)
      }
    }

    println("\nModified array (${arr.size} elements) after deletion:")
    println(arr)
}
