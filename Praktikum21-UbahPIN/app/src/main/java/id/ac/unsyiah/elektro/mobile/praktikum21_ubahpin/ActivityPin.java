package id.ac.unsyiah.elektro.mobile.praktikum21_ubahpin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Indonesia on 19/03/2016.
 */
public class ActivityPin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("ubah");
    }
    public void onClick3(View view){
        EditText ubah = (EditText) findViewById(R.id.editText2);
        String pinStr = ubah.getText().toString();
        int pinInt = Integer.valueOf(pinStr);
        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.Praktikum21_UbahPin.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("pin", pinInt);
        editor.apply();
        Intent pesan2 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan2);
        finish();
    }
}