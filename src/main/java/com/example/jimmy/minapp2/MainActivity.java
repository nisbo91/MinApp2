package com.example.jimmy.minapp2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void edit(View view){
        TextView t = (TextView) findViewById(R.id.textView);
        t.setVisibility(View.GONE);
    }
 
    @Override
    public void onClick(View v) {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setVisibility(View.VISIBLE);
    }

    public void gran(View view) {
        TextView t = (TextView) findViewById(R.id.textView);
        t.setTextColor((Color.argb(255, 255, 255, 255)));
    }
    public void ok(View view) {
        TextView t = (TextView) findViewById(R.id.textView2);
        EditText et = (EditText) findViewById(R.id.editText);
        t.setVisibility(View.VISIBLE);
        t.setText("");
        t.setText("velkommen "+et.getText());
        System.out.println("Der blev trykket");
    }
}
