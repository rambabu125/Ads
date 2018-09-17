package com.ramtech.ads;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Method;

public class IncomingCallsActivity extends AppCompatActivity {
    Button btn_disconnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incoming_calls);
        btn_disconnect = findViewById(R.id.btn_disconnect);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (KeyEvent.KEYCODE_MENU == event.getKeyCode() || KeyEvent.KEYCODE_DPAD_LEFT == event.getKeyCode()
                || KeyEvent.KEYCODE_DPAD_DOWN == event.getKeyCode() || KeyEvent.KEYCODE_DPAD_RIGHT == event.getKeyCode()
                || KeyEvent.KEYCODE_DPAD_UP == event.getKeyCode() || KeyEvent.KEYCODE_DPAD_CENTER == event.getKeyCode()
                || KeyEvent.KEYCODE_BACK == event.getKeyCode()) {
            return false;
        }
        return true;
    }
}
