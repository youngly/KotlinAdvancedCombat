package ch7_meta.s2

import ch6_generic.s1.Person
import kotlin.reflect.KClass

class KR1 {

}

fun main(args: Array<String>) {
    val java: KClass<Person> = Person::class
    java.constructors.forEach(System.out::println)
}