package me.imsean.quiz2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent intent = getIntent();
        double amount = intent.getDoubleExtra(MainActivity.EXTRA_AMOUNT, 0.0);

        TextView ausTextView = findViewById(R.id.australian);
        TextView eurosTextView = findViewById(R.id.euros);

        DecimalFormat df = new DecimalFormat("###.##");

        ausTextView.setText("Australian Dollars: " + df.format(CurrencyConverter.USDtoAustralianDollars(amount)));
        eurosTextView.setText("Euros: " + df.format(CurrencyConverter.USDToEuros(amount)));
    }
}