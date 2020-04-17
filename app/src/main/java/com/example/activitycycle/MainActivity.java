package com.example.activitycycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Toast.makeText(this, "On Create,to ", Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btn;
        btn=findViewById(R.id.btn);
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i1);
            }

        });

    }
    @Override
    protected void onStart()
    {
        Toast.makeText(this, "On Start,to ", Toast.LENGTH_SHORT).show();
        super.onStart();

    }
    @Override
    protected void onResume()
    {
        Toast.makeText(this, "On Resume,to ", Toast.LENGTH_SHORT).show();
        super.onResume();

    }
    @Override
    protected void onPause()
    {
        Toast.makeText(this, "On Pause,to ", Toast.LENGTH_SHORT).show();
        super.onPause();

    }
    @Override
    protected void onStop()
    {
        Toast.makeText(this, "On Stop,to ", Toast.LENGTH_SHORT).show();
        super.onStop();

    }
    @Override
    protected void onRestart()
    {
        Toast.makeText(this, "On Restart,to ", Toast.LENGTH_SHORT).show();
        super.onRestart();

    }
    @Override
    protected void onDestroy()
    {
        Toast.makeText(this, "On Destroy,to ", Toast.LENGTH_SHORT).show();
        super.onDestroy();

    }
}
