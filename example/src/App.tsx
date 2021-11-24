import * as React from 'react';
import { NativeModules, TouchableOpacity } from 'react-native';

import { StyleSheet, View, Text } from 'react-native';
import { multiply, showToast, getConst } from 'react-native-awesome-module';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();
  const { CalendarModule } = NativeModules;
  const onPress = () => {
    CalendarModule.createCalendarEvent('wissem', 'testLocation');
    showToast('wissem toast');
    console.log(getConst());
  };
  React.useEffect(() => {
    multiply(3, 7).then(setResult);
  }, []);

  return (
    <View style={styles.container}>
      <Text>RES: {result}</Text>
      <TouchableOpacity onPress={onPress}>
        <Text>ttttt</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
