package com.example.demo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Bundle bon=getIntent().getExtras();

        TextView tv_1=(TextView)findViewById(R.id.tv_q1);
        tv_1.setText("IF BUY A NEW ONE,I WOULD CHOOSE: "+bon.getString("Q1"));

        TextView tv_2=(TextView)findViewById(R.id.tv_q2);
        tv_2.setText("PHONE'S PRICE: "+bon.getString("Q2"));

        TextView tv_3=(TextView)findViewById(R.id.tv_q3);
        tv_3.setText("TYPE: "+bon.getString("Q3"));

        TextView tv_4=(TextView)findViewById(R.id.tv_q4);
        tv_4.setText("MY PHONE'S FUNCTIONS: "+bon.getString("Q4"));

        TextView tv_5=(TextView)findViewById(R.id.tv_q5);
        tv_5.setText("FREQUENTLY USED FUNCTIONS: "+bon.getString("Q5"));

        TextView tv_6=(TextView)findViewById(R.id.tv_q6);
        tv_6.setText("THE FUNCTION I WANT IN THE FUTURE: "+bon.getString("Q6"));

        TextView tv_7=(TextView)findViewById(R.id.tv_q7);
        tv_7.setText("THE CONDITION I WILL BUY A NEW ONE: "+bon.getString("Q7"));

        TextView tv_8=(TextView)findViewById(R.id.tv_q8);
        tv_8.setText("IF BUY A NEW ONE,I WOULD CHOOSE: "+ bon.getString("Q8"));

        TextView tv_9=(TextView)findViewById(R.id.tv_q9);
        tv_9.setText("PREFERENCE: "+bon.getString("Q9"));

        TextView tv_10=(TextView)findViewById(R.id.tv_q10);
        tv_10.setText("AGE: "+bon.getString("Q10"));

        TextView tv_11=(TextView)findViewById(R.id.tv_q11);
        tv_11.setText("GENDER: "+bon.getString("Q11"));

        TextView tv_12=(TextView)findViewById(R.id.tv_q12);
        tv_12.setText("FINANCIAL POSITION: "+bon.getString("Q12"));

    }
}
