package com.example.android.mathmaticalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void RadioButton(View view){

        boolean checked = ((RadioButton) view).isChecked();

        if(view.getId()==R.id.radio1){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.redio2){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.radio3){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.radio4){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
        }else if(view.getId()==R.id.radio5){
            Toast.makeText(this, "Correct!! Good jop", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "the answer is false.. try again please", Toast.LENGTH_SHORT).show();
            ((RadioButton) view).setChecked(false);
        }
    }
}
