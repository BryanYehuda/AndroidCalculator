package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getBox();
    }

    private void getBox()
    {
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    public void tambahOnClick(View view)
    {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());

        Double result = n1+n2;
        hasil.setText(String.valueOf(result));
    }

    public void kurangOnClick(View view)
    {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());

        Double result = n1-n2;
        hasil.setText(String.valueOf(result));
    }

    public void kaliOnClick(View view)
    {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());

        Double result = n1*n2;
        hasil.setText(String.valueOf(result));
    }

    public void bagiOnClick(View view)
    {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());

        Double result = n1/n2;
        hasil.setText(String.valueOf(result));
    }

    public void kelilingOnClick(View view)
    {
        Double r = Double.parseDouble(input1.getText().toString());
        Double result = 2*r*3.14;
        hasil.setText(String.valueOf(result));
    }

    public void luasOnClick(View view)
    {
        Double r = Double.parseDouble(input1.getText().toString());
        Double result = r*r*3.14;
        hasil.setText(String.valueOf(result));
    }

    public void pangkatOnClick(View view)
    {
        Double n1 = Double.parseDouble(input1.getText().toString());
        Double n2 = Double.parseDouble(input2.getText().toString());
        Double result = n1*n1;

        if (n2 == 0)
        {
            result = 1.0;
        }else if (n2 == 1)
        {
            result = n1;
        }else if (n2 == 2)
        {
            result = result;
        }else for (int i = 2; i < n2; i++)
            {
                result = result*n1;
            }

        hasil.setText(String.valueOf(result));
    }

    public void akarOnClick(View view)
    {
        int num = Integer.parseInt(input1.getText().toString());
        double t;
        double sqrtroot=num/2;

        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        hasil.setText(String.valueOf(sqrtroot));
    }


}