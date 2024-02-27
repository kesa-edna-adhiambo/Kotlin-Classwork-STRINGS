fun main() {
    println(fullname())
    greeting("Edna")

    var name = "Nassir"
    var year = "2002"
    var profession = "doctor"
    val sentence = "$name, born in $year is a $profession"
    println(sentence)

    val fruit = "Avocado"
    println(fruit[0])
    println(fruit[6])
    println(fruit[5])
    println(fruit.first())
    println(fruit.last())
    println(fruit.indexOf("v"))
    println(fruit.indexOf("A"))
    println(fruit.lastIndexOf("o"))

    var sent = "A big stone hit the big bird"
    val words = sent.split("")
    println(words)





}
fun fullname(): String {
    var fname = "sam"
    var lname = "smith"
    var fullname = "$fname $lname"
    return fullname
}
fun greeting(name: String){
    println("Hello $name")
}




