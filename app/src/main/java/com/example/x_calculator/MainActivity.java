package com.example.x_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_minimize,btn_maximize,btn_cancel,btn_open_navigation,btn_keep_on_top,btn_history,btn_mc,btn_mr,btn_m_plus,btn_m_minus,btn_m_options,btn_percentage,btn_ce,btn_c,btn_backspace,btn_one_x,btn_e2,btn_sqrt,btn_division,btn_one,btn_two,btn_three,btn_multiplication,btn_four,btn_five,btn_six,btn_minus,btn_seven,btn_eight,btn_nine,btn_plus,btn_sign_change,btn_zero,btn_,btn_dot,btn_equals;
    TextView tv_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_minimize=findViewById(R.id.stroke_button_minimize);
        btn_maximize=findViewById(R.id.stroke_button_maximize);
        btn_cancel=findViewById(R.id.stroke_button_cancel);
        btn_open_navigation=findViewById(R.id.tv_open_navigation);
        btn_keep_on_top=findViewById(R.id.button_keep_on_top);
        btn_history=findViewById(R.id.button_history);
        btn_mc=findViewById(R.id.button_memory_clear);
        btn_mr=findViewById(R.id.button_mr);
        btn_m_plus=findViewById(R.id.button_memory_add);
        btn_m_minus=findViewById(R.id.button_memory_subtraction);
        btn_m_options=findViewById(R.id.button_memory_options);
        btn_percentage=findViewById(R.id.button_percentage);
        btn_ce=findViewById(R.id.button_ce);
        btn_c=findViewById(R.id.button_c);
        btn_backspace=findViewById(R.id.button_backspace);
        btn_one_x=findViewById(R.id.button_one_over_x);
        btn_e2=findViewById(R.id.button_e2);
        btn_sqrt=findViewById(R.id.button_square_root);
        btn_division=findViewById(R.id.button_division);
        btn_one=findViewById(R.id.button_one);
        btn_two=findViewById(R.id.button_two);
        btn_three=findViewById(R.id.button_three);
        btn_multiplication=findViewById(R.id.button_multiplication);
        btn_four=findViewById(R.id.button_four);
        btn_five=findViewById(R.id.button_five);
        btn_six=findViewById(R.id.button_six);
        btn_minus=findViewById(R.id.button_minus);
        btn_seven=findViewById(R.id.button_seven);
        btn_eight=findViewById(R.id.button_eight);
        btn_nine=findViewById(R.id.button_nine);
        btn_plus=findViewById(R.id.button_plus);
        btn_sign_change=findViewById(R.id.button_sign_change);
        btn_zero=findViewById(R.id.button_zero);
        btn_dot=findViewById(R.id.button_dot);
        btn_equals=findViewById(R.id.button_equals);
        tv_display=findViewById(R.id.textview_display);


        btn_minimize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_maximize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_open_navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_keep_on_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_m_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_m_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_m_options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_one_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_sign_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Calculated", Toast.LENGTH_SHORT).show();
            }
        });
    }
}