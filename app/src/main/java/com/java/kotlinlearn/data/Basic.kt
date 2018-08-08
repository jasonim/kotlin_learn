package com.java.kotlinlearn.data

fun sum(a: Int, b: Int): Int {
    return a + b
}

//if 表达式
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main(args: Array<String>) {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))

    val max = max(2, 1)
    println(max)

    val x = 2
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    //for
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}