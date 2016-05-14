package com.blogspot.shalvinpd.blankactivityshalvin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.lang.String;
public class ExpenseMaster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_master);

        String[]  expense = getResources().getStringArray(R.array.Expense);
        ArrayAdapter<String>  Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, expense);
        ListView lv = (ListView)(findViewById(R.id.lwExpense));
        lv.setAdapter(Adapter);
    }

public void btnClick(View view)
    {
        EditText etExpense = (EditText)findViewById(R.id.txtExpense);
      //  etExpense.setText("Shalvin");
      //  String str = etExpense.getText().toString();
        Toast.makeText(this, etExpense.getText().toString(), Toast.LENGTH_SHORT).show();

      // Toast.makeText(this, "Expense Head Saved", Toast.LENGTH_SHORT).show();

    }
}
