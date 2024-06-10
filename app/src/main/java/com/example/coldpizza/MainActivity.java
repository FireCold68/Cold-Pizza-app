package com.example.coldpizza;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerPizzaType, spinnerPizzaSize;
    private CheckBox checkBoxCheese, checkBoxGreen_Olive,checkBoxBlack_Olive, checkBoxMushrooms, checkBoxOnions;
    private TextView textViewOrderSummary;
    private Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPizzaType = findViewById(R.id.spinnerPizzaType);
        spinnerPizzaSize = findViewById(R.id.spinnerPizzaSize);
        checkBoxCheese = findViewById(R.id.checkBoxCheese);
        checkBoxGreen_Olive = findViewById(R.id.checkBoxGreen_Olive);
        checkBoxBlack_Olive = findViewById(R.id.checkBoxBlack_Olive);
        checkBoxMushrooms = findViewById(R.id.checkBoxMushrooms);
        checkBoxOnions = findViewById(R.id.checkBoxOnions);
        buttonOrder = findViewById(R.id.buttonOrder);
        textViewOrderSummary = findViewById(R.id.textViewOrderSummary);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder() {
        String pizzaType = spinnerPizzaType.getSelectedItem().toString();
        String pizzaSize = spinnerPizzaSize.getSelectedItem().toString();
        StringBuilder toppings = new StringBuilder();

        if (checkBoxCheese.isChecked()) {
            toppings.append("Cheese ");
        }
        if (checkBoxGreen_Olive.isChecked()) {
            toppings.append("Green Olive ");
        }
        if (checkBoxBlack_Olive.isChecked()) {
            toppings.append("Black Olive ");
        }
        if (checkBoxMushrooms.isChecked()) {
            toppings.append("Mushrooms ");
        }
        if (checkBoxOnions.isChecked()) {
            toppings.append("Onions ");
        }

        String orderSummary = "Order Summary:\n" +
                "Pizza Type: " + pizzaType + "\n" +
                "Pizza Size: " + pizzaSize + "\n" +
                "Toppings: " + (toppings.length() > 0 ? toppings.toString() : "None");

        textViewOrderSummary.setText(orderSummary);
    }
}