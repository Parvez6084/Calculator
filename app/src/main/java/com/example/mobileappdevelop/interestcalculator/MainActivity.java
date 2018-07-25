package com.example.mobileappdevelop.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mParincipal,mInterest_Parsen,mtime;
    TextView minterestAmount,mTotalac;
    Button mcalulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mParincipal=findViewById(R.id.tv_princpal_Am);
        mInterest_Parsen=findViewById(R.id.tv_interest_parsent);
        mtime=findViewById(R.id.tv_time);
        mcalulator=findViewById(R.id.bt_calculat);
        minterestAmount=findViewById(R.id.tv_interestAm);
        mTotalac=findViewById(R.id.tv_totalAc);


        mcalulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String pamount = mParincipal.getText().toString();
               String intAmmount = mInterest_Parsen.getText().toString();
               String time = mtime.getText().toString();

               double p = Double.parseDouble(pamount);
               double i= Double.parseDouble(intAmmount);
               double t= Double.parseDouble(time);

               allinall totalAmount = new allinall(p,i,t);

               double interestAmount = totalAmount.getSowint();
               double totalAmounts = totalAmount.getSowtotal();

                minterestAmount.setText(Double.toString(interestAmount));
                mTotalac.setText(Double.toString(totalAmounts));


            }
        });




    }
}
