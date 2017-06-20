package andricky.justthetip;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void calculate(View view) {

        //hides keyboard when button is pressed
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);

        double totalbeforetax = getValue(editText);
        double totalaftertax = getValue(editText2);
        double tax = (getValue(editText3) / 100);
        double tip = getValue(editText4) / 100;

        TextView total = (TextView) findViewById(R.id.textView3);
        TextView justTip = (TextView) findViewById(R.id.textView4);

        if (totalbeforetax == 0) {
            total.setText("$" + (totalaftertax * (1 + tip)));
            if (tax == 0) {
                justTip.setText("$" + tip);
            } else {
                justTip.setText("$" + (((1 - tax) * totalaftertax) * tip));
            }
        } else {
            total.setText("$" + (totalbeforetax * (1 + tax)));
            justTip.setText("$" + (totalbeforetax * (1 + tip)));
        }


    }

    /** Returns the value of field if non empty, otherwise 0 */
    public double getValue(EditText et) {
        if (et.getText().length() == 0) {
            return 0;
        } else {
            return Double.parseDouble(et.getText().toString());
        }
    }
}
