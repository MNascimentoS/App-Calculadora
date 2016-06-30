package br.com.turimlab.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectando os elementos do layout no código
        TextView RESULTSCREEN = (TextView) findViewById(R.id.RESULTSCREEN);
        //Operadores
            Button ButtonMult = (Button) findViewById(R.id.buttonmult);
            Button ButtonDiv = (Button) findViewById(R.id.buttondiv);
            Button ButtonSub = (Button) findViewById(R.id.buttonsub);
            Button ButtonSoma = (Button) findViewById(R.id.buttonsoma);
            Button ButtonIgual = (Button) findViewById(R.id.buttonigual);
            Button ButtonLimpar = (Button) findViewById(R.id.buttonLimpar);
            //Numeros
            Button Button0 = (Button) findViewById(R.id.button0);
            Button Button1 = (Button) findViewById(R.id.button1);
            Button Button2 = (Button) findViewById(R.id.button2);
            Button Button3 = (Button) findViewById(R.id.button3);
            Button Button4 = (Button) findViewById(R.id.button4);
            Button Button5 = (Button) findViewById(R.id.button5);
            Button Button6 = (Button) findViewById(R.id.button6);
            Button Button7 = (Button) findViewById(R.id.button7);
            Button Button8 = (Button) findViewById(R.id.button8);
            Button Button9 = (Button) findViewById(R.id.button9);
    }

}
