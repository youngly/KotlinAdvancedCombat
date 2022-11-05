package ch6_generic.s3

import sun.print.SunMinMaxPage

fun <T : Number> sum(vararg params: T) = params.sumOf { it.toDouble() }

fun main(args: Array<String>) {
    val result = sum(1, 10, 0.6)
    println(result)
}