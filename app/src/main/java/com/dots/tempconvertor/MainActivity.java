package com.dots.tempconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTemperature;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        editTextTemperature = findViewById(R.id.editTextTemperature);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertTemperature(View view) {
        String inputText = editTextTemperature.getText().toString();

        if (!inputText.isEmpty()) {
            try {
                double celsius = Double.parseDouble(inputText);
                double fahrenheit = (celsius * 9/5) + 32;
                String result = celsius + "°C is " + fahrenheit + "°F";
                textViewResult.setText(result);
            } catch (NumberFormatException e) {
                textViewResult.setText("Invalid input. Please enter a valid number.");
            }
        } else {
            textViewResult.setText("Please enter a temperature in °C.");
        }
    }
}
