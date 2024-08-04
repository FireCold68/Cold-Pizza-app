package com.example.coldpizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        // קבלת פרטי ההזמנה
        Intent intent = getIntent();
        String pizzaType = intent.getStringExtra("pizzaType");
        int quantity = intent.getIntExtra("quantity", 0);
        double totalPrice = intent.getDoubleExtra("totalPrice", 0.0);
        String drinkType = intent.getStringExtra("drinkType");
        double drinkPrice = intent.getDoubleExtra("drinkPrice", 0.0);
        String toppingType = intent.getStringExtra("toppingType");
        double toppingPrice = intent.getDoubleExtra("toppingPrice", 0.0);

        // הצגת פרטי ההזמנה
        TextView pizzaTypeTextView = findViewById(R.id.pizzaTypeTextView);
        TextView quantityTextView = findViewById(R.id.quantityTextView);
        TextView totalPriceTextView = findViewById(R.id.totalPriceTextView);
        TextView drinkTypeTextView = findViewById(R.id.drinkTypeTextView);
        TextView drinkPriceTextView = findViewById(R.id.drinkPriceTextView);
        TextView toppingTypeTextView = findViewById(R.id.toppingTypeTextView);
        TextView toppingPriceTextView = findViewById(R.id.toppingPriceTextView);

        pizzaTypeTextView.setText("Pizza Type: " + pizzaType);
        quantityTextView.setText("Quantity: " + quantity);
        totalPriceTextView.setText("Total Price: $" + totalPrice);
        drinkTypeTextView.setText("Drink Type: " + drinkType);
        drinkPriceTextView.setText("Drink Price: $" + drinkPrice);
        toppingTypeTextView.setText("Topping Type: " + toppingType);
        toppingPriceTextView.setText("Topping Price: $" + toppingPrice);
    }
}
