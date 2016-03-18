package id.ac.unsyiah.elektro.mobile.counter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityDua extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        Intent pesan = getIntent();
        String pesanstr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.txtNilai);
        txtLabel.setText(pesanstr);
    }
}