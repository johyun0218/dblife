package com.example.dblife;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class ServiceReceiver extends BroadcastReceiver {

    private static String TAG = "DblifeBroadcastReceiver";


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "ServiceReceiver->onReceive();");

        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        String number = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
        Log.i(TAG, "state:" + state + ",number:" + number);

//        MyPhoneStateListener phoneListener = new MyPhoneStateListener();
//
//        TelephonyManager telephony = (TelephonyManager)
//
//                context.getSystemService(Context.TELEPHONY_SERVICE);
//
//        telephony.listen(phoneListener, PhoneStateListener.LISTEN_SERVICE_STATE);
//
//        telephony.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
//
//        Intent testActivityIntent = new Intent(context,CallCatcherActivity.class);
//
//        testActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//        testActivityIntent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
//
//        context.startActivity(testActivityIntent);
    }
}
