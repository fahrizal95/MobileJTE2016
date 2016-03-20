package id.ac.unsyiah.elektro.mobile.testawal_fungsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Indonesia on 19/03/2016.
 */
public class ActivityCounter extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        Intent pesan = getIntent();
        String pesan1 = pesan.getStringExtra("var1");
        String pesan2 = pesan.getStringExtra("tulis");
        TextView txtLabel = (TextView) findViewById(R.id.textView3);
        txtLabel.setText("Anda Memilih "+pesan2+" Sebanyak "+pesan1+" Kali");
    }
}
