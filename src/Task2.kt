//დაწერეთ ფუნქცია, რომელსაც გადაეცემა String ტიპის პარამეტრი და დააბრუნებს Boolean
//მნიშვნელობას.ფუნქციამ უნდა დააბრუნოს true, თუ გადმოცემული String მნიშვნელობა
//პალინდრომია, წინააღმდეგ შემთხვევაში false.
//(პალინდრომი— სიტყვა, ფრაზა ან ლექსი, რომელიც წაღმა და უკუღმა ერთნაირად იკითხება)

fun main(){
    println(isPaliandrome("anano"));
    println(isPaliandrome("civic"));
}


fun isPaliandrome(word : String) : Boolean{
    var inCorrect = "";
    var isPal = false;



    for (i in word.length-1 downTo 0 ) {
        inCorrect += word[i];
        }
    if(inCorrect == word){
        isPal = true;
    }

    return isPal;
}



