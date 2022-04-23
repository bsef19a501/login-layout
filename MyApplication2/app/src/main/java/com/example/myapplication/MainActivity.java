package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etno1;
    private EditText etno2;
    private TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etno1= (EditText)findViewById(R.id.etno1);
        etno2= (EditText)findViewById(R.id.etno2);
        Result=(TextView)findViewById(R.id.textView2);
    }

    public void btnadd(View view) {
    int n1=Integer.parseInt(etno1.getText().toString());
    int n2=Integer.parseInt(etno2.getText().toString());
    int ans=n1+n2;
    Result.setText(String.valueOf(ans));
    }

    public void btnsub(View view) {
        int n1=Integer.parseInt(etno1.getText().toString());
        int n2=Integer.parseInt(etno2.getText().toString());
        int ans=n1-n2;
        Result.setText(String.valueOf(ans));
    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(etno1.getText().toString());
        int n2=Integer.parseInt(etno2.getText().toString());
        int ans=n1*n2;
        Result.setText(String.valueOf(ans));

    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(etno1.getText().toString());
        int n2=Integer.parseInt(etno2.getText().toString());
        int ans=n1/n2;
        Result.setText(String.valueOf(ans));

    }
}