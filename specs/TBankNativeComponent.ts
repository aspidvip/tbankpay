import type { HostComponent, ViewProps } from "react-native";
import type { BubblingEventHandler } from "react-native/Libraries/Types/CodegenTypes";
import codegenNativeComponent from "react-native/Libraries/Utilities/codegenNativeComponent";

type TBankOptionsScriptLoadedEvent = {
  terminalKey: string;
  publicKey: string;
  orderId: string;
  amount?: string;
  receipt?: string;
  description?: string;
  successURL?: string;
  failURL?: string;
  customerKey?: string;
  email?: string;
};

export interface NativeProps extends ViewProps {
  // sourceURL1?: string;
  // options: (options: Object) => Promise<boolean>;
  // sourceURL?: string;
  onOptions?: BubblingEventHandler<TBankOptionsScriptLoadedEvent> | null;
  // onScriptLoaded?: BubblingEventHandler<TBankOptionsScriptLoadedEvent> | null;
}

export default codegenNativeComponent<NativeProps>(
  "CustomTBankPay"
) as HostComponent<NativeProps>;
