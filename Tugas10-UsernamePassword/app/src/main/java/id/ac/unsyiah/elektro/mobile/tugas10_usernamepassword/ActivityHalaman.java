package id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Indonesia on 25/03/2016.
 */
public class ActivityHalaman extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");
        String username = pesan.getStringExtra("var2");

        TextView txtLabel = (TextView) findViewById(R.id.txtView1);
        txtLabel.setText(pesanStr + username);
    }

    public void onUbahPassword(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityPin.class);
        startActivity(pesan);
    }
}