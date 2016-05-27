package id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.Jenis.KelasBarang;

/**
 * Created by Indonesia on 27/05/2016.
 */
public class ActivityAtur extends AppCompatActivity {

    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_isi);

        Intent pesan = getIntent();
        id = pesan.getLongExtra("id",0);

        SQLiteOpenHelper aturBarangDB = new KelasBarang(this);
        SQLiteDatabase db = aturBarangDB.getReadableDatabase();

        Cursor cursor = db.query(KelasBarang.TABEL_BARANG,
                new String[] {KelasBarang.KODE_SKU,
                        KelasBarang.NAMA_BARANG,
                        KelasBarang.HARGA,
                        KelasBarang.JUMLAH,
                        KelasBarang.GAMBAR},
                KelasBarang.ID_BARANG+"="+Long.toString(id),
                null,
                null,
                null,
                null);
        cursor.moveToFirst();

        kode = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.KODE_SKU));
        nama = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.NAMA_BARANG));
        harga = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.HARGA));
        jumlah = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.JUMLAH));
        gambar = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.GAMBAR));


        cursor.close();
        db.close();


        EditText txtKode = (EditText) findViewById(R.id.txtKode);
        txtKode.setText(kode);

        EditText txtNama = (EditText) findViewById(R.id.txtNama);
        txtNama.setText(nama);

        EditText txtHarga = (EditText) findViewById(R.id.txtHarga);
        txtHarga.setText(harga);

        EditText txtJumlah = (EditText) findViewById(R.id.txtJumlah);
        txtJumlah.setText(jumlah);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setEnabled(false);
        int posisi = Integer.parseInt(gambar);
        spinner.setSelection(posisi);


    }

    public void clickBtnUbah(View view){
        EditText txtKode = (EditText) findViewById(R.id.txtKode);
        txtKode.setEnabled(true);
        EditText txtNama = (EditText) findViewById(R.id.txtNama);
        txtNama.setEnabled(true);
        EditText txtHarga = (EditText) findViewById(R.id.txtHarga);
        txtHarga.setEnabled(true);
        EditText txtJumlah = (EditText) findViewById(R.id.txtJumlah);
        txtJumlah.setEnabled(true);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setEnabled(true);



        Button btnHapus = (Button)findViewById(R.id.btnHapus);
        btnHapus.setVisibility(View.GONE);

        Button btnUbah = (Button)findViewById(R.id.btnUbah);
        btnUbah.setVisibility(View.GONE);

        Button btnSimpan = (Button)findViewById(R.id.btnSimpan);
        btnSimpan.setVisibility(View.VISIBLE);
    }

    public void clickBtnHapus (View view){
        new AlertDialog.Builder(this)
                .setTitle("Hapus Barang!!!")
                .setMessage("Benar Ingin Menghapus Ini?")
                .setPositiveButton("Ya",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                clickBtnYaHapus(dialog, which);

                            }
                        })
                .setNegativeButton("Tidak",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    public void clickBtnYaHapus(DialogInterface dialog, int which){

        SQLiteOpenHelper aturBarangDB = new KelasBarang(this);
        SQLiteDatabase db = aturBarangDB.getWritableDatabase();
        db.delete(KelasBarang.TABEL_BARANG,
                KelasBarang.ID_BARANG + "=" + Long.toString(id),
                null);
        db.close();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan);
        finish();
    }

    public void clickBtnSimpan(View view){
        EditText txtKode = (EditText) findViewById(R.id.txtKode);
        String kodeBaru = txtKode.getText().toString();

        EditText txtNama = (EditText) findViewById(R.id.txtNama);
        String namaBaru = txtNama.getText().toString();

        EditText txtHarga = (EditText) findViewById(R.id.txtHarga);
        String hargaBaru = txtHarga.getText().toString();

        EditText txtJumlah = (EditText) findViewById(R.id.txtJumlah);
        String jumlahBaru = txtJumlah.getText().toString();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        int gambarInt = spinner.getSelectedItemPosition();
        String gambar = String.valueOf(gambarInt);


        SQLiteOpenHelper aturBarangDB = new KelasBarang(this);
        SQLiteDatabase db = aturBarangDB.getWritableDatabase();

        ContentValues barangBaru = new ContentValues();
        barangBaru.put(KelasBarang.KODE_SKU, kodeBaru);
        barangBaru.put(KelasBarang.NAMA_BARANG, namaBaru);
        barangBaru.put(KelasBarang.HARGA, hargaBaru);
        barangBaru.put(KelasBarang.JUMLAH, jumlahBaru);
        barangBaru.put(KelasBarang.GAMBAR, gambar);

        db.update(KelasBarang.TABEL_BARANG, barangBaru,
                KelasBarang.ID_BARANG + "=" + Long.toString(id),
                null);

        db.close();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(pesan);
        finish();

    }

    private long id;
    private String kode;
    private String nama;
    private String harga;
    private String jumlah;
    private String gambar;
}