import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FooTest : StringSpec({
    "failing test" {
        val foo = Foo()
        foo.method1() shouldBe  1
    }
})
