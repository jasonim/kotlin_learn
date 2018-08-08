package com.java.kotlinlearn.data

import android.content.Context
import android.util.AttributeSet
import android.view.View

//class Person(val name: String) {
//    constructor(name: String, parent: Person) : this(name) {
////        parent.add(this)
//    }
//}

class Customer(name: String) {
    val customerKey = name.toUpperCase()
}

class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

open class A {
    open fun f() { print("A")}
    fun a() { print("a") }
}

interface B {
    fun f() { print("B")}

    fun b() { print("b")}
}

class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}

interface MyInterface {
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
}

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
        // 不必实现“name”
        override val firstName: String,
        override val lastName: String,
        val position: String
) : Person
