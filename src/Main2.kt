fun main(args: Array<String>) {


//    // Val bisa diassign value hanya sekali
//    val a = 10;
//
//    // This code will error
////    a = 11;
//
//    var b = 100
//    var c = 1000
//
//
//    println("sebelum di ganti ke c : $b")
//
//    b = c
//
//    println("sebelum c dirubah nilai : $b")
//    c = 10000
//
//    println("setelah di assign ke c : $b")
//



//    // This code wont error
//    b = 200
//
//

    val cat1 = Cat( age = 10, jenisKelamin = "male" )

    // This code will error
    cat1.jenisKelamin = "female"

    cat1.age = 11
    cat1.age++


    // Cat1 is not re-assignable
//    cat1 = Cat(age = 20, jenisKelamin = "female")

    // Cat2 is re-assignable becase declared with var
    var cat2 = Cat("male", 5)

    cat2 = cat1.copy()
    cat1.age = 20
    cat1.jenisKelamin = "laki - laki"

    println(cat2)


}

data class Cat(var jenisKelamin: String,
               var age: Int)