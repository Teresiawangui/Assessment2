fun main(){
sentence("Barbie bakes brown bagels and buns")
    numbers(arrayOf())
sphere(20,3.14159)
    isPalindrome("madam,wow,kayak")
}
//1. Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun sentence(text:String){
    for (x in text.removePrefix(("B"))){
            println(x)


}}
//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.
fun numbers(num:Array<Int>):Array<Int>{
    var statistic = arrayOf(21, 14, 56, 18, 9, 32, 5, 6, 32, 67, 88, 43)
    (statistic.count())
    (statistic.sum())
    (statistic.average())
    (statistic.sum() / statistic.size)
    (statistic.sum().toDouble() / statistic.size)
    return statistic
}
//3. The volume of a sphere is calculated using the formula below

//V = 4/3 π r
//3

//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π
fun sphere(radius:Int,pi:Double){
    var volume=4/3 * pi * radius
    println(volume)
}
//4. A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word:String):Boolean {
    var text = "madam,wow,kayak"
    if (word == text)
         return true

else{
    return false
}
}





