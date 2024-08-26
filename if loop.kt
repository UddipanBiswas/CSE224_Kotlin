fun main()
{
    //TEMP
    val temp= 25
    if ( temp >= 20){
        println("it's a hot day")
    }
    
    //DRIVER LISENCE
    val age =18 
    if (age>=18){
        println("u can drive")
    }
    else{
        println("u can't drive ")
    }
    
    //REPORT CARD
    val grade= 75 
    if (grade>=90){
        println("A grade")
    }
    else if(grade<90 && grade >=80){
        println("B grade")   
    }
    else if(grade<90 && grade >=70){
        println("C grade")   
    }

    //CALCULATOR
    val num1=5
    val num2=10
    val op="+"
    if (op=="+"){
        println("result ${num1 + num2}")
    }
     else if (op=="-"){
        println("result ${num1-num2}")
    }
      else if (op=="*"){
        println("result ${num1*num2}")
    }
      else if (op=="/"){
        println("result ${num1/num2}")
    }

      //AGE 

    val age = 15 
    if (age<13){
        println("child")
    }
    else if (age in 13..19){
        println("teenager")
    }
    else if (age in 20..64){
        println("adult")
    }
    else {
        println("senior/old")
    }
    
}
