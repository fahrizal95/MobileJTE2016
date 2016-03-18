package id.ac.unsyiah.elektro.mobile.tebakgambar1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Indonesia on 12/03/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanstr = pesan.getStringExtra("var1");

        TextView txtNilai = (TextView) findViewById(R.id.editText2);
        txtNilai.setText(pesanstr);
    }
}