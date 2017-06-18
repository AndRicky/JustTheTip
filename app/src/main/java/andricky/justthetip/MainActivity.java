package andricky.justthetip;

import android.support.v7.app.AppCompatActivity;
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

    /** Called when the user taps the Send button */
    public void calculate(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
//        EditText editText2 = (EditText) findViewById(R.id.editText2);
//        EditText editText3 = (EditText) findViewById(R.id.editText3);
//        EditText editText4 = (EditText) findViewById(R.id.editText4);

        int totalbeforetax = editText.getText().length();

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText("sd");

    }
}
