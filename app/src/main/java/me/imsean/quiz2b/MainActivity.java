package me.imsean.quiz2b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_AMOUNT = "me.imsean.quiz2b.AMOUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayResults (View v) {
        Intent intent = new Intent(this, ResultsActivity.class);
        EditText editText = (EditText) findViewById(R.id.amount);

        String stringAmount = editText.getText().toString();
        double amount;

        try {
            amount = Double.parseDouble(stringAmount);
            intent.putExtra(EXTRA_AMOUNT, amount);
            startActivity(intent);
        } catch (Exception e) {}

    }
}