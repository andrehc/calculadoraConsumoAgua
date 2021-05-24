package com.example.bebaagua;

import androidx.appcompat.app.AppCompatActivity;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView resultado = (TextView) findViewById(R.id.textResultado);

        Bundle bdl = getIntent().getExtras();

        double peso = bdl.getDouble("peso");
        double resultadoCalculo = 0;
        double calculoPorGarrafa = 0;
        double calculoPorCopo = 0;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);

        resultadoCalculo = peso * 35;
        calculoPorGarrafa = resultadoCalculo / 500;
        calculoPorCopo = resultadoCalculo / 300;



//        resultado.append(resultadoCalculo + " ml" + "\n por dia");
        resultado.append(
                resultadoCalculo + " ml por dia" +
                        "\nou " + decimalFormat.format(calculoPorGarrafa) + " garrafinhas de 500ml, por dia" +
                        "\nou " + decimalFormat.format(calculoPorCopo) + " copos de 300ml, por dia"
        );

    }
}