package com.example.bebaagua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inputPeso = (TextView) findViewById(R.id.edtTextPeso);
        Button calculaPeso = (Button) findViewById(R.id.button);

        calculaPeso.setOnClickListener( v -> {
            double peso = Double.parseDouble(inputPeso.getText().toString());
            if(peso > 0){
                Intent intent = new Intent(getApplicationContext(), Resultado.class);
                intent.putExtra("peso", peso);
                startActivity(intent);
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Informe um peso válido!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, text, duration).show();
            }
        });
    }
}
