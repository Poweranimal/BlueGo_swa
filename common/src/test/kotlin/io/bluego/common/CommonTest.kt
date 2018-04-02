import kotlin.test.*
import io.bluego.common.*

class CommonTest {
    @Test
    fun testCommon() {
        assertEquals("common", Common().common())
    }

    @Test
    fun testPlatform() {
        assertTrue(Common().platform().startsWith("platform-"))
    }
}