package id.ac.unsyiah.elektro.mobile.testawal_joystick;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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
    public void onClickButton (View view){
        final TextView X = (TextView) findViewById(R.id.nilaiX);
        final TextView Y = (TextView) findViewById(R.id.nilaiY);
        final TextView Z = (TextView) findViewById(R.id.nilaiZ);
        Button Atas = (Button) findViewById(R.id.button);
        Button Bawah = (Button) findViewById(R.id.button2);
        Button Atas1 = (Button) findViewById(R.id.button3);
        Button Bawah1 = (Button) findViewById(R.id.button4);
        Button Atas2 = (Button) findViewById(R.id.button5);
        Button Bawah2 = (Button) findViewById(R.id.button6);




        Atas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                X.setText((String.valueOf(x)));
            }
        });

        Bawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x--;
                X.setText((String.valueOf(x)));
            }
        });

        Atas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y++;
                Y.setText((String.valueOf(y)));
            }
        });

        Bawah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y--;
                Y.setText((String.valueOf(y)));
            }
        });

        Atas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z++;
                Z.setText((String.valueOf(z)));
            }
        });

        Bawah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                z--;
                Z.setText((String.valueOf(z)));
            }
        });
    }
    int x=0;
    int y = 0;
    int z = 0;
}

