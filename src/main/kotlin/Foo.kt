class Foo {
    fun method1(): Int {
        return this.method2()
    }

    private fun method2(): Int {
        return this.divideByZero()
    }

    private fun divideByZero(): Int {
        return 1 / 0
    }
}
