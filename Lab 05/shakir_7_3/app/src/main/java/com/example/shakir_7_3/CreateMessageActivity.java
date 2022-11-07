package com.example.shakir_7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        EditText msgText = findViewById(R.id.editText);
        String messageText = msgText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chooseIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chooseIntent);
    }
}