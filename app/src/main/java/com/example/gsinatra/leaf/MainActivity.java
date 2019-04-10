package com.example.gsinatra.leaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    double val1;
    char curOp = ' ';
    EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.editText);

        txt1.setInputType(InputType.TYPE_NULL);

        Button num1 = (Button) findViewById(R.id.num1);

        num1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"1");

            }
        });



        Button num2 = (Button) findViewById(R.id.num2);

        num2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"2");

            }
        });


        Button num3 = (Button) findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"3");

            }
        });


        Button num4 = (Button) findViewById(R.id.num4);
        num4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"4");

            }
        });


        Button num5 = (Button) findViewById(R.id.num5);
        num5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"5");

            }
        });


        Button num6 = (Button) findViewById(R.id.num6);
        num6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"6");

            }
        });


        Button num7 = (Button) findViewById(R.id.num7);
        num7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"7");

            }
        });


        Button num8 = (Button) findViewById(R.id.num8);
        num8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"8");

            }
        });


        Button num9 = (Button) findViewById(R.id.num9);
        num9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"9");

            }
        });


        Button num0 = (Button) findViewById(R.id.num0);
        num0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText(txt1.getText()+"0");

            }
        });


        Button sum = (Button) findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                val1 = Double.parseDouble(txt1.getText().toString());
                curOp  = '+';
                txt1.setText("");

            }
        });


        Button dif = (Button) findViewById(R.id.dif);
        dif.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                val1 = Double.parseDouble(txt1.getText().toString());
                curOp  = '-';
                txt1.setText("");

            }
        });


        Button mult = (Button) findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                val1 = Double.parseDouble(txt1.getText().toString());
                curOp  = 'x';
                txt1.setText("");

            }
        });


        Button div = (Button) findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                val1 = Double.parseDouble(txt1.getText().toString());
                curOp  = '/';
                txt1.setText("");

            }
        });


        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txt1.setText("");

            }
        });

        Button obrace = (Button) findViewById(R.id.obrace);
        obrace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                curOp  = '(';
                txt1.setText("");

            }
        });


        Button cbrace = (Button) findViewById(R.id.cbrace);
        cbrace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                curOp  = ')';
                txt1.setText("");

            }
        });

        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               calcProc();

            }
        });


    }

    void calcProc(){
        double val2 = Double.parseDouble(txt1.getText().toString());
        double res = 0;

        if (curOp == '+')
            res = val1+val2;
        else if(curOp == '-')
            res = val1-val2;
        else if(curOp == 'x')
            res = val1*val2;
        else if(curOp == '/')
            res = val1/val2;

        txt1.setText(Double.toString(res));



    }



}
