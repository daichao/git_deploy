package org.apache.cordova.device;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Echo extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray  args,
			CallbackContext callbackContext) throws JSONException {
		if(action.equals("echo")){
			String message=args.getString(0);
			this.echo(message,callbackContext);
			return true;
		}
		return false;
	}
	
	public void echo(String message,CallbackContext callbackContext){
		 if (message != null && message.length() > 0) {
             callbackContext.success(message);
         } else {
             callbackContext.error("Expected one non-empty string argument.");
         }
	}

}
