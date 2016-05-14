package com.blogspot.shalvinpd.blankactivityshalvin;

/**
 * Created by Administrator on 5/5/2016.
 */

import android.content.ContentValues;
import android.content.Context;
import  android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.StringBuilderPrinter;


public class DbConnect {

    public static String Exp_Id = "ExpenseId";
    public  static  String Exp_Name = "ExpenseName";

    public static String Trans_Id = "TransId";
    public static String Amount = "Amount";
    public static String Date = "Date";
    public static String Description = "Description";

    public static String Database_Name = "ExpenseTracker";
    public static String Table_Name = "Expense";
    public static String Table_ExpenseDetail = "ExpenseDetail";

    public static  int  Database_Version = 1;

    private DbConnect ourHelper;
    private final Context ourContext1;

    public DbConnect() {
        ourContext1 = null;
    }

    private SQLiteDatabase db;

    public static class DbHelper extends  SQLiteOpenHelper
    {
        public DbHelper(Context context)
        {
            super(context, Database_Name, null, Database_Version);
        }

        @Override
        public void onCreate(SQLiteDatabase db)
        {
            db.execSQL("Create table " + Table_Name + "(" + Exp_Id + " Integer primary  key autoincrement, " + Exp_Name + " text);");
            String strExpenseDetail = "Create table " + Table_ExpenseDetail + "(" + Trans_Id + "integer primary key autoincrement, " +
                    Amount + " numeric(8, 2), " + Date + " date, " + Description + " varchar(200))";
            db.execSQL(strExpenseDetail);
        }

        public void addExpense(String ExpenseName)
        {
            ContentValues cv = new ContentValues();
            cv.put(Exp_Name, ExpenseName );
          //  db.insert(Table_Name, null, cv);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db,  int oldVersion, int newVersion)
        {
            
        }
    }
}
