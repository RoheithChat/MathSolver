package com.example.mathsolver;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Solve(View view) {
        TextView result = null;
        try {
            EditText input = findViewById(R.id.Expression);
            result = findViewById(R.id.answer);
            String inputString = input.getText().toString();

            Expression expression = new ExpressionBuilder(inputString).build();

            double answer = expression.evaluate();
            result.setText(String.format("%.2f", answer));
        } catch (Exception e) {
            result.setText("Error");
        }

    }
}
