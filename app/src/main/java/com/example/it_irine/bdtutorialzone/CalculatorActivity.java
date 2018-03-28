package com.example.it_irine.bdtutorialzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity  implements View.OnClickListener{
    double fn,sn;
    String operator;
    EditText et;
    Button back,clear,plus,minus,multi,div,equal,dot,pnm,off,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et = (EditText) findViewById(R.id.et);
        back = (Button) findViewById(R.id.back);
        clear = (Button) findViewById(R.id.clear);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multi = (Button) findViewById(R.id.multi);
        div = (Button) findViewById(R.id.div);

        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        pnm = (Button) findViewById(R.id.pnm);
        off = (Button) findViewById(R.id.off);

        n0 = (Button) findViewById(R.id.n0);
        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);

        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);
        pnm.setOnClickListener(this);
        off.setOnClickListener(this);

        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        try{
            String string = et.getText().toString();
            switch (v.getId()){
                case R.id.back:
                    StringBuilder stB = new StringBuilder(string);
                    stB.deleteCharAt(string.length()-1);
                    et.setText(stB.toString());
                case R.id.clear:
                    et.setText("");
                    break;
                case R.id.plus:
                    operator = "+";
                    fn = Double.parseDouble(et.getText().toString());
                    et.setText("");
                    break;
                case R.id.minus:
                    operator = "-";
                    fn = Double.parseDouble(et.getText().toString());
                    et.setText("");
                    break;
                case R.id.pnm:
                    et.setText(Double.parseDouble(et.getText().toString())*(-1)+"");
                    break;
                case R.id.multi:
                    operator = "*";
                    fn = Double.parseDouble(et.getText().toString());
                    et.setText("");
                    break;
                case R.id.div:
                    operator = "/";
                    fn = Double.parseDouble(et.getText().toString());
                    et.setText("");
                    break;
                case R.id.equal:
                    sn = Double.parseDouble(et.getText().toString());
                    double result = 0;
                    switch (operator){
                        case "+":
                            result = fn+sn;
                            break;
                        case "-":
                            result = fn-sn;
                            break;
                        case "*":
                            result = fn*sn;
                            break;
                        case "/":
                            result = fn/sn;
                            break;
                    }
                    et.setText(result+"");
                    break;
                case R.id.n7:
                    et.setText(string+n7.getText());
                    break;
                case R.id.n8:
                    et.setText(string+n8.getText());
                    break;
                case R.id.n9:
                    et.setText(string+n9.getText());
                    break;
                case R.id.n4:
                    et.setText(string+n4.getText());
                    break;
                case R.id.n5:
                    et.setText(string+n5.getText());
                    break;
                case R.id.n6:
                    et.setText(string+n6.getText());
                    break;
                case R.id.n1:
                    et.setText(string+n1.getText());
                    break;
                case R.id.n2:
                    et.setText(string+n2.getText());
                    break;
                case R.id.n3:
                    et.setText(string+n3.getText());
                    break;
                case R.id.dot:
                    et.setText(string+dot.getText());
                    break;
                case R.id.n0:
                    et.setText(string+n0.getText());
                    break;
                case R.id.off:
                    finish();
            }
        }catch (Exception e){
            Toast.makeText(CalculatorActivity.this,"Please type proper input",Toast.LENGTH_SHORT).show();
        }


    }
}
