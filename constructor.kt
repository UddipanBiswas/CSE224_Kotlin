class person{
    var name:String
    var age:Int
    
    constructor(x:String,y:Int){
    this.name=x
    this.age=y
    }
    
    constructor(x:String){
        this.name=x 
        this.age=0 
    }
    
    constructor(){
        this.name="Rahul"
        this.age= 22 
    }
fun intro(){
    println("My name is $name and age is $age")
}
}

fun main() {
    var a=person("riya",30)
    a.intro()
    var b=person()
    b.intro()
    var c=person("Heena")
    c.intro()
    
}


//OTHER METHOD

class person(var name:String,var age:Int){
    constructor(x:String):this(){
        this.name=x 
        this.age=0 
    }
    
    constructor():this("rahul",50)
    fun intro(){
    println("My name is $name and age is $age")
}
}

fun main() {
    var a=person("riya",30)
    a.intro()
    var b=person()
    b.intro()
    var c=person("Heena")
    c.intro()
    
}

