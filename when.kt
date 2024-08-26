fun main() {
  //week of day
    val day=5
    var week = when (day){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else -> "invalid"
    }
    println("day is $week")
    
    //EVEN OR ODD
    val num=16
    when{
        num%2==0 ->println("$num is even")
        num%2!=0 ->println("$num is odd")
        else->println("unexpected number")
    }
    
}
