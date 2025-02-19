package com.tbankpay

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.CustomTBankPayManagerInterface;
import com.facebook.react.viewmanagers.CustomTBankPayManagerDelegate;

@ReactModule(name = ReactTBankPayManager.REACT_CLASS)
class ReactTBankPayManager(context: ReactApplicationContext) : SimpleViewManager<ReactTBankPay>(), CustomTBankPayManagerInterface<ReactTBankPay> {
  private val delegate: CustomTBankPayManagerDelegate<ReactTBankPay, ReactTBankPayManager> =
    CustomTBankPayManagerDelegate(this)

  override fun getDelegate(): ViewManagerDelegate<ReactTBankPay> = delegate

  override fun getName(): String = REACT_CLASS

  override fun createViewInstance(context: ThemedReactContext): ReactTBankPay = ReactTBankPay(context)

//  @ReactProp(name = "sourceUrl")
//  override fun setSourceURL(view: ReactTBankPay, sourceURL: String?) {
//    if (sourceURL == null) {
//      view.emitOnScriptLoaded(ReactTBankPay.OnScriptLoadedEventResult.error)
//      return;
//    }
//    view.loadUrl(sourceURL, emptyMap())
//  }

  companion object {
    const val REACT_CLASS = "CustomTBankPay"
  }

//  override fun getExportedCustomBubblingEventTypeConstants(): Map<String, Any> =
//      mapOf(
//          "onScriptLoaded" to
//              mapOf(
//                  "phasedRegistrationNames" to
//                      mapOf(
//                          "bubbled" to "onScriptLoaded",
//                          "captured" to "onScriptLoadedCapture"
//                      )))
}