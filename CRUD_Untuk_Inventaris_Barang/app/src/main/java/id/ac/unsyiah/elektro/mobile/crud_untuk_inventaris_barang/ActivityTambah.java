package id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.Jenis.KelasBarang;

/**
 * Created by Indonesia on 27/05/2016.
 */
public class ActivityTambah extends AppCompatActivity {
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_penambahan);
    }

    public void onClickTambah(View view) {

        TextView txtNama = (TextView) findViewById(R.id.txtNama);
        String nama = txtNama.getText().toString();
        TextView txtKode = (TextView) findViewById(R.id.txtKode);
        String kode = txtKode.getText().toString();
        TextView txtJumlah = (TextView) findViewById(R.id.txtJumlah);
        String jumlah = txtJumlah.getText().toString();
        TextView txtHarga = (TextView) findViewById(R.id.txtHarga);
        String harga = txtHarga.getText().toString();
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        int gambarInt = spinner.getSelectedItemPosition();
        String gambar = String.valueOf(gambarInt);


        SQLiteOpenHelper aturBarangDB = new KelasBarang(this);
        SQLiteDatabase db = aturBarangDB.getWritableDatabase();

        ContentValues barangBaru = new ContentValues();
        barangBaru.put(KelasBarang.KODE_SKU, kode);
        barangBaru.put(KelasBarang.NAMA_BARANG, nama);
        barangBaru.put(KelasBarang.JUMLAH, jumlah);
        barangBaru.put(KelasBarang.HARGA, harga);
        barangBaru.put(KelasBarang.GAMBAR, gambar);

        db.insert(KelasBarang.TABEL_BARANG, null, barangBaru);
        db.close();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan);
        finish();


    }
}





