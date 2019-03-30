package com.example.login_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,passwrd;
    Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.name);
                passwrd=(EditText) findViewById(R.id.Pswd);
                clk = (Button) findViewById(R.id.button);
    }

    public void movepage(View v)
    {
       String Stname = username.getText().toString();
       String Stpswd = passwrd.getText().toString();

       if(Stname.equals("abcd") && Stpswd.equals("12345"))
       {
           Intent in = new Intent(MainActivity.this,Home.class);
           startActivity(in);

       }

       else //(Stname.equals("")   || Stpswd.equals(""));
        {
            Toast.makeText(getBaseContext(),"enter name and pswd",Toast.LENGTH_SHORT).show();

        }
       /* else
        {
            Toast.makeText(getBaseContext(),"wrong credentials",Toast.LENGTH_SHORT).show() ;
        }*/


    }



}
