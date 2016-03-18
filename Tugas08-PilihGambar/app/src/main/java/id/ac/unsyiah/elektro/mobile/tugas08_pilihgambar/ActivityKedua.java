package id.ac.unsyiah.elektro.mobile.tugas08_pilihgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Indonesia on 18/03/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        int pesanStr = pesan.getIntExtra("posisi", 0);
        int [] daftarGambar = {0,R.drawable.mobil,R.drawable.sepedamotor,R.drawable.becakmotor,R.drawable.becakdayung,R.drawable.sepeda};

        ImageView gambar = (ImageView) findViewById(R.id.imgHasil);
        gambar.setImageResource(daftarGambar[pesanStr]);
    }
}