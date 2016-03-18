package id.ac.unsyiah.elektro.mobile.tebakgambar1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

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
    public void onClickbtnTebak (View view){
        Random rand = new Random();
        int n = rand.nextInt(100);

        EditText edtText = (EditText) findViewById(R.id.editText);
        String strEdtText = edtText.getText().toString();
        Integer angkaEdtText = Integer.valueOf(strEdtText);




        if (angkaEdtText==n){
            Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
            String hasil = Integer.toString(n);
            pesan.putExtra("var1","Benar, angkanya adalah "+hasil);
            startActivity(pesan);

        }
        else {
            Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
            String hasil = Integer.toString(n);
            pesan.putExtra("var1","Salah, angkanya adalah "+hasil);
            startActivity(pesan);
        }}}
