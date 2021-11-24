package com.reactnativeawesomemodule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;
import android.widget.Toast;


public class CalendarModule extends ReactContextBaseJavaModule {
  CalendarModule(ReactApplicationContext context) {
    super(context);
  }
  @ReactMethod
  public void createCalendarEvent(String name, String location) {
    Log.d("CalendarModule", "Create event called with name: " + name
      + " and location: " + location);

  }

  @ReactMethod
  public void showToast (String msg) {
    Toast.makeText(getReactApplicationContext(),msg , Toast.LENGTH_LONG).show();
  }
  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("DEFAULT_EVENT_NAME", "New Event");
    return constants;
  }
  @Override
  public String getName() {
    return "CalendarModule";
  }
}
