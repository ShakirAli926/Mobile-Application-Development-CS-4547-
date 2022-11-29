package com.example.shakir_7_1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messageText  = intent.getStringExtra("message");
        TextView messageView = findViewById(R.id.getMessageText);
        messageView.setText(messageText);
    }

}