import kotlin.test.*
import io.bluego.Platform

class ActualPlatformTest {
    @Test
    fun testPlatform() {
        assertEquals("platform-native", Platform().platform())
    }
}
