package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    class object {
        val `var`: Int = 0

        fun test() {
            testNotRenamed("var", { `var` })
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}