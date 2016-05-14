package com.blogspot.shalvinpd.blankactivityshalvin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Administrator on 5/5/2016.
 */
public class Expense extends Activity {

    String a[] = {"Uber", "Taxi", "Shirt", "Pen drive"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expensetrack);

        Spinner sp = (Spinner)(findViewById(R.id.spnExpense));
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, a);
        sp.setAdapter(ad);

    }

    public void btnDClick(View view)
    {
        EditText et = (EditText)findViewById(R.id.txtExpense);

        String str = "Expense Logged" + et.getText().toString();

      //  Toast.makeText(this, "Expense Logged", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
