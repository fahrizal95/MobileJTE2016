package id.ac.unsyiah.elektro.mobile.testawal_fungsi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    int A =0;
    int B =0;
    int C =0;
    int D =0;
    int E =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClick (View view){
        RadioButton a = (RadioButton) findViewById(R.id.tombolA);
        RadioButton b = (RadioButton) findViewById(R.id.tombolB);
        RadioButton c = (RadioButton) findViewById(R.id.tombolC);
        RadioButton d = (RadioButton) findViewById(R.id.tombolD);
        RadioButton e = (RadioButton) findViewById(R.id.tombolE);
        final Intent pesan = new Intent(getApplicationContext(), ActivityCounter.class);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A++;
                pesan.putExtra("var1", (String.valueOf(A)));
                pesan.putExtra("tulis", "A");
                startActivity(pesan);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B++;
                pesan.putExtra("var1", (String.valueOf(B)));
                pesan.putExtra("tulis", "B");
                startActivity(pesan);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C++;
                pesan.putExtra("var1", (String.valueOf(C)));
                pesan.putExtra("tulis", "C");
                startActivity(pesan);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                D++;
                pesan.putExtra("var1", (String.valueOf(D)));
                pesan.putExtra("tulis", "D");
                startActivity(pesan);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E++;
                pesan.putExtra("var1", (String.valueOf(E)));
                pesan.putExtra("tulis", "E");
                startActivity(pesan);
            }


        });
    }
}
