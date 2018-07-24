/**
 * Created by Pamxy on 2018/7/3.
 */


///1.
//
//package hello
//
//fun main(args: Array<String>) {
//    println("Hello Kotlin!")
//}

///2.
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    //创建一个对象不用new 关键字
    Greeter("World!").greet()
}