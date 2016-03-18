package id.ac.unsyiah.elektro.mobile.tugas09_tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Indonesia on 19/03/2016.
 */
public class ActivityKedua  extends Activity {
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesan1Str = pesan.getStringExtra("varl");
        int pesan2Str = pesan.getIntExtra("var2", 0);

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHasil.setText(pesan1Str);

        ImageView imgPilih = (ImageView) findViewById(R.id.imgPilih);
        imgPilih.setImageResource(pesan2Str);
    }
}

