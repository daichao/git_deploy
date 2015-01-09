

package com.daichao.myPush;


import android.os.Bundle;

import org.apache.cordova.*;

import com.igexin.sdk.PushManager;

public class CordovaApp extends CordovaActivity
{
	public static CordovaActivity droidGap;
	WebExtension webExtension;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
       
        droidGap=this;
        appView.getSettings().setJavaScriptEnabled(true);
         webExtension = new WebExtension(this,appView);
		appView.addJavascriptInterface(webExtension, "WebExtension");
		 // Set by <content src="index.html" /> in config.xml 
		loadUrl(launchUrl);
        PushManager.getInstance().initialize(this.getApplicationContext());

    }
    
}


