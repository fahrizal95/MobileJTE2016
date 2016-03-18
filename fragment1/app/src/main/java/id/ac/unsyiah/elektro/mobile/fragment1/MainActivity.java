package id.ac.unsyiah.elektro.mobile.fragment1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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

    public void onClick0(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "0");
    }

    public void onClick1(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "1");
    }

    public void onClick2(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "2");
    }

    public void onClick3(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "3");
    }

    public void onClick4(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "4");
    }

    public void onClick5(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "5");
    }

    public void onClick6(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "6");
    }

    public void onClick7(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "7");
    }

    public void onClick8(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "8");
    }

    public void onClick9(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtHasil);
        txtTulisan.setText(txtTulisan.getText() + "9");
    }
}
}