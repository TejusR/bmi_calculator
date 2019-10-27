package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.DataOutput;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public EditText editTexttwo;
    public TextView textView;
    public   Float a;
    public   Float b;
    public   Float c;
    public String string;


    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editTextt);
        editTexttwo=findViewById(R.id.editTextt2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    a=Float.parseFloat(editText.getText().toString());
                    b=Float.parseFloat(editTexttwo.getText().toString())/100;
                    c=a/(b*b);
                    string= new Float(c).toString();

                    if (c<19&&c>0)
                        Toast.makeText(MainActivity.this,"  UNDERWEIGHT ",Toast.LENGTH_SHORT).show();
                    else if (c>=19&&c<25)
                        Toast.makeText(MainActivity.this," NORMAL ",Toast.LENGTH_SHORT).show();
                    else if(c<=25 &&c< 29 )
                        Toast.makeText(MainActivity.this,"OVER WEIGHT",Toast.LENGTH_SHORT).show();
                    else if (c>=29 && c<39)
                        Toast.makeText(MainActivity.this," OBESSE",Toast.LENGTH_SHORT).show();
                    else if (c>=39 && c<54)
                        Toast.makeText(MainActivity.this," EXTREMELY OBESSE",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this," !!! RISK CONSULT DOCTOR ",Toast.LENGTH_SHORT).show();
                textView.setText(string);
                Toast.makeText(MainActivity.this,"Spider Sucks",Toast.LENGTH_SHORT).show();

        }



        });
    }
}
