package com.seifabuitrabish.class1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Boxer myBoxer=new Boxer(1,2,3);
        Log.i("MyTag",myBoxer.toString());
    //    myBoxer.punchSpeed=900;
      //  Log.i("MyTag","Punch Speed: "+myBoxer.punchSpeed+" Punch Power: "+myBoxer.punchPower+"");
      //  KickBoxer myKickBoxer=new KickBoxer();
       // Log.i("MyTag",myKickBoxer.toString());
        myBoxer.setNumberOfGloves(2);
        Log.i("Tag",myBoxer.getNumberOfGloves()+"");

    }
}
