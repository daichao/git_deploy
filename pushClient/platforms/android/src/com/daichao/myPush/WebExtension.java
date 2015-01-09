package com.daichao.myPush;

import org.apache.cordova.CordovaActivity;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class WebExtension {
	    private CordovaActivity mGap;
	    private WebView mAppView;
	    private String clientID;
	    public String getClientID() {
			return clientID;
		}
		public void setClientID(String clientID) {
			this.clientID = clientID;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		private String userID;
	    
		public WebExtension(CordovaActivity cordova,WebView view){
			mAppView=view;
			mGap=cordova;
		}
		// 从webview通过javascript调用android接口具体实现方法
		@JavascriptInterface 
		public void show(String message){
			Log.i("GexinSdkDemo", message);
		}
		@JavascriptInterface 
		public void attention(String clientID){
			this.setClientID(clientID);
			System.out.println(clientID);
			Log.i("GexinSdkDemo", clientID);
		}
	}
