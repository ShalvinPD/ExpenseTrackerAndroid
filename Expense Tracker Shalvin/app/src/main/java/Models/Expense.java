package Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 5/5/2016.
 */
public class Expense implements Parcelable {
    private String ExpenseName;

    public String getExpenseName() {
        return ExpenseName;
    }

    public void setExpenseName(String expenseName) {
        ExpenseName = expenseName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        applyDefaultValues();
    }

    private void applyDefaultValues() {
    }
}
