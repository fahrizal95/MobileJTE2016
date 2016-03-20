package id.ac.unsyiah.elektro.mobile.contohsharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int counterHidup = ambilCounterHidup();
        String counterHidupStr = Integer.toString(counterHidup);
        TextView txtCounter = (TextView) findViewById(R.id.txtCounter);
        txtCounter.setText(counterHidupStr);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
    private int ambilCounterHidup() {
        SharedPreferences sharedPreferences = getSharedPreferences("id.ac.unsyiah.elektro.mobile.ContohSharedPref.PREF_BERSAMA", Context.MODE_PRIVATE);
            int Counter = sharedPreferences.getInt("counterJalankan", 0);

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt ("counterJalankan", Counter + 1);
            editor.apply();

            return Counter;
        }
    }

