package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
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
    public void onClickSamaDengan(View view) {
        EditText a01 = (EditText) findViewById(R.id.a01);
        String a01Str = String.valueOf(a01.getText());
        float huruf01 = Float.valueOf(a01Str);

        EditText a02 = (EditText) findViewById(R.id.a02);
        String a02Str = String.valueOf(a02.getText());
        float huruf02 = Float.valueOf(a02Str);

        EditText a03 = (EditText) findViewById(R.id.a03);
        String a03Str = String.valueOf(a03.getText());
        float huruf03 = Float.valueOf(a03Str);

        EditText a04 = (EditText) findViewById(R.id.a04);
        String a04Str = String.valueOf(a04.getText());
        float huruf04 = Float.valueOf(a04Str);

        RadioButton Plus = (RadioButton) findViewById(R.id.radioButton);
        RadioButton Minus = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton Kali = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton Bagi = (RadioButton) findViewById(R.id.radioButton4);

        float Hasil1=0;
        float Hasil2=0;
        float Hasil3=0;
        float Hasil4=0;


        if (Plus.isChecked()== true) {
            Hasil1=huruf01+huruf03;
            Hasil2=huruf02+huruf04;
            Hasil3=huruf01+huruf02;
            Hasil4=huruf03+huruf04;

        } else if (Minus.isChecked() == true) {
            Hasil1=huruf01-huruf03;
            Hasil2=huruf02-huruf04;
            Hasil3=huruf01-huruf02;
            Hasil4=huruf03-huruf04;

        } else if (Kali.isChecked() == true) {
            Hasil1=huruf01*huruf03;
            Hasil2=huruf02*huruf04;
            Hasil3=huruf01*huruf02;
            Hasil4=huruf03*huruf04;
        } else if (Bagi.isChecked() == true) {
            Hasil1=huruf01/huruf03;
            Hasil2=huruf02/huruf04;
            Hasil3=huruf01/huruf02;
            Hasil4=huruf03/huruf04;
        }

        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);
        String hasil3Str = String.valueOf(Hasil3);
        String hasil4Str = String.valueOf(Hasil4);

        TextView hasil1 = (TextView) findViewById(R.id.a11);
        hasil1.setText(hasil1Str);
        TextView hasil2 = (TextView) findViewById(R.id.a12);
        hasil2.setText(hasil2Str);
        TextView hasil3 = (TextView) findViewById(R.id.a13);
        hasil3.setText(hasil3Str);
        TextView hasil4 = (TextView) findViewById(R.id.a14);
        hasil4.setText(hasil4Str);
    }
}

