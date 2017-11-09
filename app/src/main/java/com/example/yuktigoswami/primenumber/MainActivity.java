package com.example.yuktigoswami.primenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t;
    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        e=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a,k;
        k=0;
        String s=e.getText().toString();
        a=Integer.parseInt(s);
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                k=1;
                break;
            }

        }
        if(k==0){
            t.setText("Prime Number");
        }
        else{
            t.setText("NOT Prime Number");
        }
        e.setText(null);
    }
}
