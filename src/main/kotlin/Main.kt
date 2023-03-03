
fun main(){
    var adalab =Human("Bridget",23,60.45)
    adalab.eat(3)
    println(adalab.weight)
    adalab.speak("English")

    adalab.birthday()
    var student=User("Serena","Alpha","bridgetnakakandea@gmail.com","0757589859","Bridget@256")
    println(student.firstName)
    println(student.lastName)
    println(student.email)

}
//QUESTION ONE

class Human(var name:String,var age:Byte,var weight:Double){
    fun eat(foodWeight: Int) {
        println("Iam eating $foodWeight kgs of food")
        weight += foodWeight


    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday() {
        age ++
        println(age)
    }

}
//QUESTION TWO
data class User(var firstName:String,var lastName:String,var  email:String,var phoneNumber:String,var password:String){

}

//1. Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
//-
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes (3 points)


