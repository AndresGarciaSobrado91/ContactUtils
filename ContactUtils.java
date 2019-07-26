package com.delyva.partnerapp.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ContactUtils {

    public static void sendSMS(Activity activity, String receiver) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri data = Uri.parse("sms: " + receiver);
        intent.setData(data);

        try {
            activity.startActivity(intent);
        } catch (Exception e){
            Toast.makeText(activity,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public static void callContact(Activity activity, String receiver){
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri data = Uri.parse("tel:" + receiver);
        intent.setData(data);

        try {
            activity.startActivity(intent);
        } catch (Exception e){
            Toast.makeText(activity,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

}
