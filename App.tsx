import React from "react";
import { Alert, StyleSheet, View } from "react-native";
import WebView from "./specs/TBankNativeComponent";

function App(): React.JSX.Element {
  return (
    <View style={styles.container}>
      <WebView />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: "center",
    alignContent: "center",
  },
  webview: {
    width: "100%",
    height: "100%",
  },
});

export default App;
