package ch7_meta.s3

class Field1 {
    val x = 1
}

val y = 1

fun main(args: Array<String>) {
    val field1 = Field1()
    val kProperty1 = Field1::x
    println(kProperty1.get(field1))
    println(kProperty1)

    println(::y)

}