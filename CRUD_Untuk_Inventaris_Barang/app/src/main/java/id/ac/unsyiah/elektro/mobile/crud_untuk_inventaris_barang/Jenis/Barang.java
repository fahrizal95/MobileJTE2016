package id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.Jenis;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.unsyiah.elektro.mobile.crud_untuk_inventaris_barang.R;

/**
 * Created by Indonesia on 27/05/2016.
 */
public class Barang extends CursorAdapter {
    public Barang(Context context, Cursor cursor){
        super(context, cursor, 0);
    }

    public View newView(Context context, Cursor cursor, ViewGroup parent){
        return LayoutInflater.from(context).inflate(R.layout.activity_jenis, parent, false);

    }

    public void bindView(View view, Context context, Cursor cursor){
        String nama = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.NAMA_BARANG));
        TextView txtNama = (TextView) view.findViewById(R.id.txtNama);
        txtNama.setText(nama);

        String sku = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.KODE_SKU));
        TextView txtKode = (TextView) view.findViewById(R.id.txtKode);
        txtKode.setText(sku);

        String gambarStr = cursor.getString(cursor.getColumnIndexOrThrow(KelasBarang.GAMBAR));
        ImageView txtGambar = (ImageView) view.findViewById(R.id.imageView);
        int posisi = Integer.parseInt(gambarStr);
        int [] gambar = {R.drawable.unavalaible,R.drawable.becakdayung, R.drawable.sepeda,R.drawable.sepedamotor};
        txtGambar.setImageResource(gambar[posisi]);


    }
}