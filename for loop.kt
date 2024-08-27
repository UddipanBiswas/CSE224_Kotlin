fun main() {
    for (i in 1 until 5){
        println(i)
    }
    
    for (j in 1..5){
        println(j)
    }
    
   for (item in 5 downTo 1 step 3){
       println(item)
   }
   
   val fruits=listOf("apple","banana","mango")
   for (fruit in fruits){
       println(fruit)
   }
   
   for ( index in fruits.indices)
    {
        println("fruits at index: $index is $(fruits[index]) ")
    }
    
}
