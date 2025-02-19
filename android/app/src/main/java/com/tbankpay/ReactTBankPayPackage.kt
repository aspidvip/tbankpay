package com.tbankpay

import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import com.facebook.react.uimanager.ViewManager

class ReactTBankPayPackage : BaseReactPackage() {
  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    return listOf(ReactTBankPayManager(reactContext))
  }

  override fun getModule(s: String, reactApplicationContext: ReactApplicationContext): NativeModule? {
    when (s) {
      ReactTBankPayManager.REACT_CLASS -> ReactTBankPayManager(reactApplicationContext)
    }
    return null
  }

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider = ReactModuleInfoProvider {
    mapOf(ReactTBankPayManager.REACT_CLASS to ReactModuleInfo(
      name = ReactTBankPayManager.REACT_CLASS,
      className = ReactTBankPayManager.REACT_CLASS,
      canOverrideExistingModule = false,
      needsEagerInit = false,
      isCxxModule = false,
      isTurboModule = true
    )
    )
  }
}