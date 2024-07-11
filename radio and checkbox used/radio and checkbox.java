//                              radio and check box use

//                              main.java file

package com.example.checkandradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 TextView  textview1;
 EditText edittext1,edittext2;
 RadioButton radiobutton1,radiobutton2;
 RadioGroup radiogroup;
 CheckBox checkbox;
 Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = findViewById(R.id.Gender);
        edittext1 = findViewById(R.id.name);
        edittext2 = findViewById(R.id.mobilenumber);
        radiobutton1 = findViewById(R.id.male);
        radiobutton2 = findViewById(R.id.female);
        radiogroup = findViewById(R.id.radiogroup);
        checkbox = findViewById(R.id.checkbox);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (error()){
                    Intent intent = new Intent( MainActivity.this, MainActivity2.class);
                    startActivity(intent);

                }
            }
        });

    }
    private boolean error(){

        if (edittext2.getText().toString().length() == 0){

            Toast.makeText(MainActivity.this, "please fill mobile number", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (edittext2.getText().toString().length() !=10){
            Toast.makeText(MainActivity.this, "please enter valid mobile number", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else if (textview1.getText().toString().length() ==0){
            Toast.makeText(MainActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else if (!radiobutton1.isChecked() && !radiobutton2.isChecked()){
            Toast.makeText(MainActivity.this, "Please select your gender", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else if (!checkbox.isChecked()){
            Toast.makeText(MainActivity.this, "please select term and condition", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}