package io.bluego.bluegoswa

import android.os.Bundle
import android.util.Log
import io.bluego.common.Common
import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity(): FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)

    Log.e("Platform", Common().platform())
  }
}
