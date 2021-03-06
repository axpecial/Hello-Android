package com.example.andyduong.helloandy;

import android.graphics.drawable.ColorDrawable;
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
                TextView currentTextView = findViewById(R.id.textView);
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
                View currentView = findViewById(R.id.rootView);
                if (((ColorDrawable)currentView.getBackground()).getColor() == getResources().getColor(R.color.colorAccent)) {
                    currentView.setBackgroundColor(
                            getResources().getColor(R.color.orange)
                    );
                } else {
                    currentView.setBackgroundColor(
                            getResources().getColor(R.color.colorAccent)
                    );
                }
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
                    ((TextView) findViewById(R.id.textView)).setText("Android is awesome!");
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
                // Remove focus from text field
                ((EditText) findViewById(R.id.editText)).clearFocus();
                // TODO: I wanted to hide soft keyboard but there is no easy way to do so.
            }
        });
    }
}
