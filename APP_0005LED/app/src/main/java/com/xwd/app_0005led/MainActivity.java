package com.xwd.app_0005led;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.Toast;
import com.xwd.hardlibrary.*;

public class MainActivity extends AppCompatActivity {

    private boolean ledon = false;
    private Button button = null;
    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;

    class MyButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {

            HardControl hardControl = new HardControl();
                // perform action on clock
                ledon = !ledon;
                if (ledon) {
                    button.setText("ALL OFF");
                    checkBoxLed1.setChecked(true);
                    checkBoxLed2.setChecked(true);
                    checkBoxLed3.setChecked(true);
                    checkBoxLed4.setChecked(true);
                }
                else {
                    button.setText("ALL ON");
                    checkBoxLed1.setChecked(false);
                    checkBoxLed2.setChecked(false);
                    checkBoxLed3.setChecked(false);
                    checkBoxLed4.setChecked(false);
                }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.LED1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED1 On", Toast.LENGTH_SHORT).show();
                }
                    else{
                        Toast.makeText(getApplicationContext(), "LED1 of", Toast.LENGTH_SHORT).show();
                    }
                break;
            case R.id.LED2:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED2 On", Toast.LENGTH_SHORT).show();
                }
                    else{
                        Toast.makeText(getApplicationContext(), "LED2 of", Toast.LENGTH_SHORT).show();
                    }
                break;
            case R.id.LED3:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED3 On", Toast.LENGTH_SHORT).show();
                }
                    else{
                        Toast.makeText(getApplicationContext(), "LED3 of", Toast.LENGTH_SHORT).show();
                    }
                break;
            case R.id.LED4:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(getApplicationContext(), "LED4 On", Toast.LENGTH_SHORT).show();
                }
                    else{
                        Toast.makeText(getApplicationContext(), "LED4 of", Toast.LENGTH_SHORT).show();
                    }
                break;
            // TODO: Veggie sandwich
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.BUTTON);
        checkBoxLed1 = (CheckBox) findViewById(R.id.LED1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.LED2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.LED3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.LED4);

        button.setOnClickListener(new MyButtonListener());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // perform action on clock
                ledon = !ledon;
                if (ledon)
                    button.setText("ALL OFF");
                else
                    button.setText("ALL ON");
            }
            });
          */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
