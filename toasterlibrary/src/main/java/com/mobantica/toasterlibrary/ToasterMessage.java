package com.mobantica.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static  void  showToast(Context mContext,String message){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
    }
}
