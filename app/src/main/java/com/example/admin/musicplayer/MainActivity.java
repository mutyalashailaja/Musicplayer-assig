package com.example.admin.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mstart;
    private Button mStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mstart = (Button)findViewById(R.id.start);
        mStop = (Button)findViewById(R.id.stop);

        mstart.setOnClickListener(this);
        mStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.start){

            Intent start=new Intent(this,MyService.class);
            startService(start);
        }
        else {

            if(v.getId()==R.id.stop){
                Intent stop=new Intent(this,MyService.class);
                stopService(stop);
            }
        }

       /* switch(v.getId())
        {
            case R.id.start:

                Intent playIntent  = new Intent(this, MyService.class);
                startService(playIntent);
                break;

            case R.id.stop:
                Intent stopIntent  = new Intent(this, MyService.class);
                stopService(stopIntent);
                break;
        }*/
    }
}
