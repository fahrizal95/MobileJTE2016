package id.ac.unsyiah.elektro.mobile.praktikum20_pin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void onClick (View view){
        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.prak20_pin.PREF_BERSAMA", Context.MODE_PRIVATE);
        int pinPref = sharedPreferences.getInt("pin", 1234);
        EditText pin = (EditText) findViewById(R.id.editText);
        String pinStr = pin.getText().toString();
        int pinInt = Integer.valueOf(pinStr);
        if(pinInt == pinPref){
            Intent pesan = new Intent(getApplicationContext(), ActivityHalaman.class);
            pesan.putExtra("var1","Peu Haba !");
            startActivity(pesan);
        }else{
            Toast.makeText(this, "Maaf Angka Yang Anda Masukkan Salah ! ", Toast.LENGTH_LONG).show();
        }
    }
}