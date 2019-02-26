package com.example.childtoparentdataactivity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2;
TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.num1);
        edt2=findViewById(R.id.num2);
        txtresult=findViewById(R.id.resulttxt);
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(edt1.getText().toString().trim());
                int num2=Integer.parseInt(edt2.getText().toString().trim());
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("num1",num1);
                i.putExtra("num2",num2);
                startActivityForResult(i,1);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if (resultCode== RESULT_OK){
                int sum=data.getIntExtra("result",0);
                txtresult.setText(""+sum);
            }
        }
    }

}
