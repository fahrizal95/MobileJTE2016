package id.ac.unsyiah.elektro.mobile.tugas04_kalkulatorkompleks;

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
    public void onClickBtnButton(View view){
    EditText angkaRil1 = (EditText) findViewById(R.id.angkaRil1);
    String angka1RilStr = String.valueOf(angkaRil1.getText());
    int angka1Ril = Integer.valueOf(angka1RilStr);

    EditText angkaRil2 = (EditText) findViewById(R.id.angkaRil2);
    String angka2RilStr = String.valueOf(angkaRil2.getText());
    int angka2Ril = Integer.valueOf(angka2RilStr);

    EditText angkaImajiner1 = (EditText) findViewById(R.id.angkaImajiner1);
    String angka1ImajinerStr = String.valueOf(angkaImajiner1.getText());
    int angka1Imajiner = Integer.valueOf(angka1ImajinerStr);

    EditText angkaImajiner2 = (EditText) findViewById(R.id.angkaImajiner2);
    String angka2ImajinerStr = String.valueOf(angkaImajiner2.getText());
    int angka2Imajiner = Integer.valueOf(angka2ImajinerStr);

    RadioButton Plus = (RadioButton) findViewById(R.id.radioButtonPlus);
    RadioButton Minus = (RadioButton) findViewById(R.id.radioButtonMinus);
    RadioButton Kali = (RadioButton) findViewById(R.id.radioButtonKali);

    int Hasil1=0;
    int Hasil2=0;
    String simbol;

    if (Plus.isChecked()== true) {
        Hasil1 = angka1Ril+angka2Ril;
        Hasil2 = angka1Imajiner+angka2Imajiner;

    } else if (Minus.isChecked() == true) {
        Hasil1 = angka1Ril-angka2Ril;
        Hasil2 = angka1Imajiner-angka2Imajiner;

    } else if (Kali.isChecked() == true) {
        Hasil1 = angka1Ril*angka2Ril-angka1Imajiner*angka2Imajiner;
        Hasil2 = angka1Imajiner*angka2Ril+angka1Ril*angka2Imajiner;
    }

    String hasil1Str = String.valueOf(Hasil1);
    String hasil2Str = String.valueOf(Hasil2);

    if(Hasil2>=0){
        simbol="+";
    }
    else {
        simbol="";
    }

    TextView lblHasil = (TextView) findViewById(R.id.txtHasil);
    lblHasil.setText(hasil1Str+simbol+hasil2Str+"i");
}
}
