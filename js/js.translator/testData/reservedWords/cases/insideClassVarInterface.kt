package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    var interface: Int = 0

    fun test() {
        testNotRenamed("interface", { interface })
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}