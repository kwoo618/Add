package com.example.add;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button ebutton;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button_c;
    private Button button0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ebutton = (Button) findViewById(R.id.ebutton);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button_c = (Button) findViewById(R.id.button_c);
        button0 = (Button) findViewById(R.id.button0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void onClicked_e(View view) {
        String resurt = textView.getText().toString();
        if ((resurt.charAt(resurt.length() - 1) != "+") {
            if (resurt.contains("+")) {
                int a = resurt.indexOf("+");
                int b = resurt.indexOf("+");
            }
        }
    }
    public void onClicked_c(View view) {
        textView.setText("");
    }




    public void onClicked7(View view) {
        textView.setText(textView.getText().toString()+("7"));
    }
    public void onClicked8(View view) {
        textView.setText(textView.getText().toString()+("8"));
    }
    public void onClicked9(View view) {
        textView.setText(textView.getText().toString()+("9"));
    }
    public void onClicked4(View view) {
        textView.setText(textView.getText().toString()+("4"));
    }
    public void onClicked5(View view) {
        textView.setText(textView.getText().toString()+("5"));
    }
    public void onClicked6(View view) {
        textView.setText(textView.getText().toString()+("6"));
    }
    public void onClicked1(View view) {
        textView.setText(textView.getText().toString()+("1"));
    }
    public void onClicked2(View view) {
        textView.setText(textView.getText().toString()+("2"));
    }
    public void onClicked3(View view) {
        textView.setText(textView.getText().toString()+("3"));
    }
    public void onClicked0(View view) {
        textView.setText(textView.getText().toString()+("0"));
    }
    public void onClicked_1(View view) {
        textView.setText(textView.getText().toString()+("+"));
    }
    public void onClicked_2(View view) {
        textView.setText(textView.getText().toString()+("-"));
    }
    public void onClicked_3(View view) {
        textView.setText(textView.getText().toString()+("*"));
    }
    public void onClicked_4(View view) {
        textView.setText(textView.getText().toString()+("/"));
    }


}