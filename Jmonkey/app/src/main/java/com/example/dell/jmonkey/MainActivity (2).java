package com.example.dell.jmonkey;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        private static Quaternion magNorthHipQ = new Quaternion();
        private static Quaternion magNorthOtherQ = new Quaternion();

        static void rotateModel(float[] toAngles) {
            float z = toAngles[2];//*180/FastMath.PI;// * FastMath.PI/180;
            System.out.println(z*180/pi);
            humSkeleton.setAllcorrectionQ(0,z,0);
            // magNorthangle = toAngles[2];
            // magNorthHipQ.fromAngles(0, toAngles[2], 0);
            //humSkeleton.setAllcorrectionQ(0, -z, 0);
            //magNorthOtherQ.fromAngles(toAngles[2],0,0);
        }



}
