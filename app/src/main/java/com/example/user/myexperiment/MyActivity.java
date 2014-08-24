package com.example.user.myexperiment;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MyActivity extends Activity {

    TextView out;
    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        button = (Button) findViewById(R.id.button);
        out = (TextView) findViewById(R.id.out);
        editText = (EditText) findViewById(R.id.editText);



        //if (editText.length()== 0){
            out.setText("Введите что нибудь!");
        //}


        OnClickListener b = new OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setText(editText.getText() + "\n Text have " + Integer.toString(editText.length()) + " chars");
               /*
                if (editText.length() == 5){
                    out.setText("Роскошно!");
                }
                */
            }
        };

        button.setOnClickListener(b);

   }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
