package com.hfad.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class CreateMessageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(“message”, messageText);

        startActivity(intent);
    }
}
