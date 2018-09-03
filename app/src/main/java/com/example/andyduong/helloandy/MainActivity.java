package com.example.andyduong.helloandy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView currentTextView = ((TextView) findViewById(R.id.textView));
                if (currentTextView.getCurrentTextColor() == getResources().getColor(R.color.white)) {
                    currentTextView.setTextColor(
                            getResources().getColor(R.color.black)
                    );
                } else {
                    currentTextView.setTextColor(
                            getResources().getColor(R.color.white)
                    );
                }
            }
        });

        // Change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
                ((TextView) findViewById(R.id.textView)).setText(
                        "GOOD LUCK ^_^"
                );
            }
        });

        // Change text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Grab the user-inputted text
                String userInput = ((TextView) findViewById(R.id.editText)).getText().toString();
                // Set the value of the text view to be the user-inputted text, or to a default
                //  string if no input
                if (TextUtils.isEmpty(userInput)) {
                    ((TextView) findViewById(R.id.textView)).setText(
                            "You've been blessed by the Android pupper. Press the woof button for good luck."
                    );
                }
                else {
                    ((TextView) findViewById(R.id.textView)).setText(userInput);
                }
            }
        });

        // Reset
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Reset text color to white
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.white)
                );
                // Reset background color to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent)
                );
                // Reset text to "Hello from Andy!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Andy!");
                // Reset text field to empty
                ((EditText) findViewById(R.id.editText)).setText("");
            }
        });
    }
}
