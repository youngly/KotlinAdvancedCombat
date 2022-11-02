package ch6_generic.s1

import com.google.gson.Gson

fun main(args: Array<String>) {
    val personJson = """
        {
            "age":1
        }
    """.trimIndent()
    val fromJson = Gson().fromJson<Person>(personJson)
    println(fromJson.age)
}

inline fun <reified T> Gson.fromJson(json: String): T = Gson().fromJson(json, T::class.java)


class Person {
    var age: Int = 0
}