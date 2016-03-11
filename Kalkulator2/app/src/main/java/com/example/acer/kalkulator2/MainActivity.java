package com.example.acer.kalkulator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

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

    public void onClickBtnSamaDengan(View view) {
        EditText numAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = numAngka1.getText().toString();
        float angka1 = Float.valueOf(angka1Str);

        EditText numAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = numAngka2.getText().toString();
        float angka2 = Float.valueOf(angka2Str);

        Spinner spnOperasi = (Spinner) findViewById(R.id.spnOperasi);
        TextView txtHasil = (TextView) findViewById(R.id.lblHasil);

        String selectedItem = (String) spnOperasi.getSelectedItem();
        if (selectedItem.trim().equals("+")) {
            float hasil = Float.valueOf(angka1 + angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        } else if (selectedItem.trim().equals("-")) {
            float hasil = Float.valueOf(angka1 - angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        } else if (selectedItem.trim().equals("*")) {
            float hasil = Float.valueOf(angka1 * angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        } else if (selectedItem.trim().equals("/")) {
            float hasil = Float.valueOf(angka1 / angka2);
            String hasilStr = Float.toString(hasil);
            txtHasil.setText(hasilStr);
        }
    }
}

