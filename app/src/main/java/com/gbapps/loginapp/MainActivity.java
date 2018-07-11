package com.gbapps.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
   // private TextView Info;
    private Button Login;
    //public int count=5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Name= (EditText)findViewById(R.id.editText4);
         Password = (EditText)findViewById(R.id.editText5);
         Login = (Button)findViewById(R.id.button);




         Login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 validate(Name.getText().toString(),Password.getText().toString());
             }
         });
    }

    private void validate(String userName, String userPass) {
        if ((userName == "admin") && (userPass == "pass")) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
        /*else{
            count--;
            if(count == 0){
                Login.setEnabled(false);*/
    }


}
