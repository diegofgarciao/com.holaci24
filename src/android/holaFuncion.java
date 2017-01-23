package com.holaci24.pluginHola;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;


public class holaFuncion extends CordovaPlugin {
private CallbackContext callbackContext;
private string saludo = "ControlesInteligentes";
private string respuesta;
@Override
public boolean execute (String action, final JSONArray args, CallbackContext callbackContext){
if(action.equals("holaMundo")){
respuesta = args + saludo;
callbackContext.sendPluginResult(respuesta);
}

return true;
};


}
