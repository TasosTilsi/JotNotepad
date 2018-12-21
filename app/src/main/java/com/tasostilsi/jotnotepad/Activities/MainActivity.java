package com.tasostilsi.jotnotepad.Activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.marcoscg.dialogsheet.DialogSheet;
import com.tasostilsi.jotnotepad.Helpers.CustomToast;
import com.tasostilsi.jotnotepad.Helpers.SaveSharedPreferences;
import com.tasostilsi.jotnotepad.R;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_ID_MULTIPLE_PERMISSIONS = 1;
    FloatingActionButton createNoteBtn;
    FloatingActionButton createRecBtn;
    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeTheViews();

        if (!SaveSharedPreferences.getFirstTimeRun(this)) {
            welcomeDialog();
            SaveSharedPreferences.setFirstTimeRun(this, true);
        }

        setSupportActionBar(toolbar);

        createNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        createRecBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own actionasdasdasdasdad", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initializeTheViews() {
        CustomToast.createToast(MainActivity.this, getResources().getString(R.string.welcome), Toast.LENGTH_SHORT);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView) findViewById(R.id.mainListView);
        createNoteBtn = (FloatingActionButton) findViewById(R.id.create_note);
        createRecBtn = (FloatingActionButton) findViewById(R.id.create_record);
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

    private void welcomeDialog() {

        new DialogSheet(this)
                .setTitle(getResources().getString(R.string.app_name))
                .setMessage(getResources().getString(R.string.welcome_message))
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton(R.string.continue_btn, new DialogSheet.OnPositiveClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Your action
                    }
                })
                .setBackgroundColor(Color.WHITE) // Your custom background color
                .show();
    }

    @Override
    public void onBackPressed() {

        new DialogSheet(this)
                .setTitle(getResources().getString(R.string.app_name))
                .setMessage(getResources().getString(R.string.goodbye_message))
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setPositiveButton(R.string.continue_btn, new DialogSheet.OnPositiveClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(MainActivity.this, getResources().getString(R.string.bye), Toast.LENGTH_SHORT).show();
                        CustomToast.createToast(MainActivity.this, getResources().getString(R.string.bye), Toast.LENGTH_SHORT);
                        finish();
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogSheet.OnNegativeClickListener() {
                    @Override
                    public void onClick(View view) {
                        //dismiss
                    }
                })
                .setBackgroundColor(Color.WHITE) // Your custom background color
                .show();
    }
}
