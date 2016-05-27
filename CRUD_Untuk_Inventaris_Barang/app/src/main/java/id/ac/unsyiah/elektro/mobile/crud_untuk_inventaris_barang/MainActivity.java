package id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.Jenis.Barang;
import id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.Jenis.KelasBarang;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listBarang = (ListView) findViewById(R.id.listBarang);

        SQLiteOpenHelper aturBarangDB = new KelasBarang(this);
        db = aturBarangDB.getReadableDatabase();

        cursor = db.query(KelasBarang.TABEL_BARANG,
                new String[]{KelasBarang.ID_BARANG,
                        KelasBarang.KODE_SKU,
                        KelasBarang.NAMA_BARANG,
                        KelasBarang.GAMBAR},
                null,
                null,
                null,
                null,
                KelasBarang.NAMA_BARANG);

        Barang barangCursorAdapter = new Barang(this, cursor);

        listBarang.setAdapter(barangCursorAdapter);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View view,
                                            int nomorBerapa,
                                            long id) {

                        clickItemListBarang(listView, view, nomorBerapa, id);
                    }
                };
        listBarang.setOnItemClickListener(itemClickListener);

    }

    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }

    public void clickItemListBarang(AdapterView<?> listView,
                                    View v,
                                    int position,
                                    long id){
        String kode = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.KODE_SKU));
        String nama = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.NAMA_BARANG));
        String gambar = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.GAMBAR));

        Intent pesan = new Intent(getApplicationContext(), ActivityAtur.class);
        pesan.putExtra("id",id);
        startActivity(pesan);
    }

    public void clickTambah(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityTambah.class);
        startActivity(pesan);
    }

    private SQLiteDatabase db;
    private Cursor cursor;
}