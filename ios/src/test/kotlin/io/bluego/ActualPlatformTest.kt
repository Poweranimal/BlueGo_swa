import kotlin.test.*
import io.bluego.common.Platform

class ActualPlatformTest {
    @Test
    fun testPlatform() {
        assertEquals("platform-native", Platform().platform())
    }
}
