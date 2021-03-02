package com.usenativemodeule; // replace com.your-app-name with your app’s name
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;
import com.facebook.react.bridge.Promise;

public class CalendarModule extends ReactContextBaseJavaModule {
    CalendarModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CalendarModule";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);
    }

    @ReactMethod 
    public String getUrlUno() {
        return "URL_UNO";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("PATH_UNO", "consultar/saldo");
        constants.put("PATH_DOS", "consultar/transferencias");

        return constants;
    }
    // usando callback
    @ReactMethod
    public void createCalendarEventWithCallback(String name, String location, Callback myFailureCallback, Callback mySuccessCallback) {
        Integer eventId = 1;
        callBack.invoke(null, eventId);
    }

    // usando promise
    // ***con este enfoque en js se puede utilizar await
    @ReactMethod
    public void createCalendarEventPromise(String name, String location, Promise promise) {
        try {
            Integer eventId = 1;
            promise.resolve(eventId);
        } catch(Exception e) {
            promise.reject("Create Event Error", e);
        }
    }

    // se pueden ejecutar eventos desde nativo a js
    // 
}