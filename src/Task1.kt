//დაწერეთ ფუნქცია, რომელიც პარამეტრად მიიღებს მთელი რიცხვების მასივს და დააბრუნებს
//მთელ მნიშვნელობას.ფუნქციამ უნდა გამოთვალოს მასივში ლუწ ინდექსზე მდგომი რიცხვების
//საშუალო არითმეტიკული.
//მოიყვანეთ ფუნქციის გამოყენების მაგალითი.

fun main(){

    println(returnAvg(arrayOf(3,6,7,8,9,10)));
    println(returnAvg(arrayOf(4,5,6,7,8,9,14)));

}

fun returnAvg(arr : Array<Int>) : Int{
    var evenIndexs = 0;
    var list = listOf<Int>();
    for(i in arr.indices){
        if(i%2==0){
            list += arr[i];
            evenIndexs += arr[i];
        }
    }
    return evenIndexs / list.size;
}