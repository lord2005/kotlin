package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    class object {
        fun case() { case() }

        fun test() {
            testNotRenamed("case", { ::case })
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}