package io.bluego

import io.bluego.Platform

actual class Platform actual constructor() {
    actual fun platform(): String = "platform-native"
}
