package com.example.justaddit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private TextView textView;
    private EditText number2;
    private Button button;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=findViewById(R.id.editTextNumber);
        number2=findViewById(R.id.editTextNumber2);
        textView=findViewById(R.id.textView3);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=number.getText().toString();
                String b=number2.getText().toString();
                int add1=Integer.parseInt(a);
                int add2=Integer.parseInt(b);

                textView.setText("Woahhhh! The added value is "+(add1 +add2));


            }
        });




    }
}