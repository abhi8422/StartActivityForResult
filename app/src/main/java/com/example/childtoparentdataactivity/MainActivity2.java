package com.example.childtoparentdataactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView txtshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtshow=findViewById(R.id.show);
        Intent i=getIntent();
        final int num1=i.getIntExtra("num1",0);
        final int num2=i.getIntExtra("num2",0);
        txtshow.setText(""+num1+","+num2);
        findViewById(R.id.Add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int add=num1+num2;
                Intent resultintent=new Intent();
                resultintent.putExtra("result",add);
                setResult(RESULT_OK,resultintent);
                finish();
            }
        });
        findViewById(R.id.Sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int add=num1-num2;
                Intent resultintent=new Intent();
                resultintent.putExtra("result",add);
                setResult(RESULT_OK,resultintent);
                finish();
            }
        });
    }
}
