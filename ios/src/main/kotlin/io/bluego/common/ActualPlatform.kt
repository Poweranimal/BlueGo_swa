package io.bluego.common

import io.bluego.common.Platform
import platform.Foundation.*

actual class Platform actual constructor() {
    actual fun platform(): String = "platform-native"
}
