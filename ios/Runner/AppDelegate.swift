import UIKit
import Flutter
import KotlinNative

@UIApplicationMain
@objc class AppDelegate: FlutterAppDelegate {
  override func application(
    _ application: UIApplication,
    didFinishLaunchingWithOptions launchOptions: [UIApplicationLaunchOptionsKey: Any]?
  ) -> Bool {
    GeneratedPluginRegistrant.register(with: self)
    
    NSLog(KotlinNativeCommon().platform())
    
    return super.application(application, didFinishLaunchingWithOptions: launchOptions)
  }
}
