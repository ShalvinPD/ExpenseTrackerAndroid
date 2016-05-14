package com.blogspot.shalvinpd.expensemanagementshalvin;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;
import android.widget.Toast;

/**
 * Created by Administrator on 5/13/2016.
 */
public class DbConnect {

    private static final String DatabaseName = "ExpenseDb";
    private static final int DatabaseVersion = 1;
    private static final String Table_Expense = "Expense";
    Context context;
    SQLiteDatabase db;

    private static final String Expense_Id = "ExpenseId";
    private static final String Expense_Name = "ExpenseName";

    public void AddExpense(String Expense) {
        ContentValues cv = new ContentValues();
        cv.put(Expense_Name, Expense);

        long id = db.insert(Table_Expense, null, cv);
    }

    public class DbConnectAdaptor extends SQLiteOpenHelper {


        private static final String DatabaseName = "ExpenseDb";
        private static final int DatabaseVersion = 1;
        private static final String Table_Expense = "Expense";

        private static final String Expense_Id = "ExpenseId";
        private static final String Expense_Name = "ExpenseName";

        public DbConnectAdaptor(Context context) {
            super(context, DatabaseName, null, DatabaseVersion);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            String strSql = "create table " + Table_Expense + "(" + Expense_Id + " integer primary key autoincrement, " +
                    Expense_Name + " varchar(40))";
            db.execSQL(strSql);
            // Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
            //  Message
        }




        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

}