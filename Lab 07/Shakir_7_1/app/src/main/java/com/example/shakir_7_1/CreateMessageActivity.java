package com.example.shakir_7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        EditText msg = findViewById(R.id.editText);
        Intent intent = new Intent(this,ReceiveMessageActivity.class);
        String messageTxt = msg.getText().toString();
        intent.putExtra("message", messageTxt);
        startActivity(intent);
    }
}