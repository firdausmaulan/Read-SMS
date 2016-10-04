package com.fd.readsms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static EditText etSms;
    private static String sender = "";
    private static String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSms = (EditText) findViewById(R.id.etSMS);
    }

    // Called in IncomingSms.class
    public static void getSmsDetails(String phoneNumber, String SMSBody) {
        sender = phoneNumber;
        message = SMSBody;
    }

    // Called in IncomingSms.class
    public static void setMessage() {
        if (sender.equalsIgnoreCase("+628990224950") || sender.equalsIgnoreCase("08990224950")) {
            etSms.setText(message);
            etSms.refreshDrawableState();
        }
    }
}
