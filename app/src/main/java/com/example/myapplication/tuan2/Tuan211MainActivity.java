package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Tuan211MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_main);
        //anh xa
        txt1=findViewById(R.id.demotext1);
        txt2=findViewById(R.id.demotext2);
        btn1=findViewById(R.id.button);
        btn1.setOnClickListener(v->{
    Intent i =new Intent(Tuan211MainActivity.this, tuan211secondMainActivity.class);
    i.putExtra("so1",txt1.getText().toString());
    i.putExtra("so2",txt2.getText().toString());
    startActivity(i);
        });
    }
}