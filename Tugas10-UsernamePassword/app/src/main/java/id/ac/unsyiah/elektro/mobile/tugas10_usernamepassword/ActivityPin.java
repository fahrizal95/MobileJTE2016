package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Indonesia on 25/03/2016.
 */
public class ActivityPin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword.PREF_BERSAMA", Context.MODE_PRIVATE);
        String user = sharedPreferences.getString("username", "");
        EditText username = (EditText) findViewById(R.id.username2);
        username.setText(user);

    }

    public void onSimpanPassword(View view){
        EditText ubahpin = (EditText) findViewById(R.id.username2);
        String username = ubahpin.getText().toString();

        EditText ubahpin2 = (EditText) findViewById(R.id.pass2);
        String password = ubahpin2.getText().toString();


        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.apply();


        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan);
        finish();
    }
}

