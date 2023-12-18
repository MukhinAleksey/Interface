package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aninterface.entity.Airplane;
import com.example.aninterface.entity.Helicopter;

public class MainActivity extends AppCompatActivity {

    private Airplane airplane01, airplane02;
    private Helicopter helicopter;
    private EditText input;
    private Button button;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            int distance = Integer.parseInt(input.getText().toString());

            airplane01 = new Airplane((byte) 210, 850,3700);
            airplane02 = new Airplane((byte) 189, 900,2800);
            helicopter = new Helicopter((byte) 8, 250,14);


            output.setText("Самолет 1 пролетит за " + airplane01.time(distance) + " часов на " + airplane01.consumption(distance) + " кг. топлива\n"
            + "Самолет 2 пролетит за " + airplane02.time(distance) + " часов на " + airplane02.consumption(distance) + " кг. топлива\n"
            + "Вертолет пролетит за " + helicopter.time(distance) + " часов на " + helicopter.consumption(distance) + " кг. топлива\n");
        }
    };
}