package com.example.siddharthareddy.budgetmanager10;

import android.animation.AnimatorSet;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.DialerKeyListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1);
    }

    public void onclick(View v)
    {
      //  final ProgressDialog
        showDialog(0);


    }

    @Override
    protected Dialog onCreateDialog(int id )
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        switch (id ) {
            case 0 :
                builder.setIcon(R.drawable.ic_launcher);
                builder.setTitle("The Amount you entered is " );
                builder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int whichButton)
                    {
                    Toast.makeText(getBaseContext(),"ok clicked",Toast.LENGTH_LONG).show();


                    }
                }
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getBaseContext(),"ok clicked",Toast.LENGTH_LONG).show();
                            }
                        });


                });




        }

}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity1, menu);
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
}
