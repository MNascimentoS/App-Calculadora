package br.com.turimlab.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int i = 0;
    int count = 0;
    int[] Result;
    int Total = 0;
    String operator;
    TextView RESULTSCREEN;
    static int INVALID = 9999999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = new int[2];
        RESULTSCREEN = (TextView) findViewById(R.id.RESULTSCREEN);
    }

    //Caso algum botão for clicado
    @Override
    public void onClick(View view) {
        //Caso os operadores forem clicados
        switch (view.getId()) {
            case R.id.buttonsoma: operator = "soma";    //Soma
                proximoNumero();
                break;
            case R.id.buttonsub: operator = "sub";      //Subtração
                proximoNumero();
                break;
            case R.id.buttonmult: operator = "mult";    //Multiplicação
                proximoNumero();
                break;
            case R.id.buttondiv: operator = "div";      //Divisão
                proximoNumero();
                break;
            case R.id.buttonigual: calcular();          //Calcula
                count = 0;
                break;
            case R.id.buttonLimpar: limpar();           //Limpar tudo
                break;
        }

        //Se for menor que o tamanho máximo da tela
        if(count<7) {
            //Caso algum número for clicado
            switch (view.getId()) {
                case R.id.button0: //Adicionando o zero no result
                    Result[i] = (Result[i] * 10); count++;
                    break;
                case R.id.button1: //Adicionando o um no result
                    Result[i] = (Result[i] * 10) + 1; count++;
                    break;
                case R.id.button2: //Adicionando o dois no result
                    Result[i] = (Result[i] * 10) + 2; count++;
                    break;
                case R.id.button3: //Adicionando o tres no result
                    Result[i] = (Result[i] * 10) + 3; count++;
                    break;
                case R.id.button4: //Adicionando o quarto no result
                    Result[i] = (Result[i] * 10) + 4; count++;
                    break;
                case R.id.button5: //Adicionando o cinco no result
                    Result[i] = (Result[i] * 10) + 5; count++;
                    break;
                case R.id.button6: //Adicionando o seis no result
                    Result[i] = (Result[i] * 10) + 6; count++;
                    break;
                case R.id.button7: //Adicionando o sete no result
                    Result[i] = (Result[i] * 10) + 7; count++;
                    break;
                case R.id.button8: //Adicionando o oito no result
                    Result[i] = (Result[i] * 10) + 8; count++;
                    break;
                case R.id.button9: //Adicionando o nove no result
                    Result[i] = (Result[i] * 10) + 9; count++;
                    break;
            }
        }
        changesResult();    //Troca o resultado na tela
        Total = 0;          //Zera o velor de total para não dar erro
    }

    //Executa as operações
    private void calcular(){
        double value;
        switch (operator){
            //Executa as operações e sai do switch
            case "soma": Total = (Result[0] + Result[1]); break;
            case "sub": Total = Result[0] - Result[1]; break;
            case "mult": Total = Result[0] * Result[1]; break;
            case "div": Total = Result[0] / Result[1]; break;
        }
        //Se for um valor inválido
        if (Total<INVALID) {
            Result[0] = Total;  //Para executar mais operações
            Result[1] = 0;      //Passa para o segundo valor
            i = 1;
        }
    }

    //Troca o resultado na tela
    private void changesResult(){
        if (Total != 0 && Total<INVALID){                   //Se o valor total for válido
            String tela = String.valueOf(Total);
            RESULTSCREEN.setText(tela);
        }else if (Total>INVALID){                           //Se o valor total for inválido
            String tela = "ERROR";
            RESULTSCREEN.setText(tela);
        } else {                                            //Se ainda não foi calculado o resultado
            String tela = String.valueOf(Result[i]);
            RESULTSCREEN.setText(tela);
        }
    }

    //Limpar a Tela
    private void limpar(){
        i = 0;          //Passa para o primeiro numero do vetor
        Result[0] = 0;  //Zera os vetores
        Result[1] = 0;
        Total = 0;      //Zera o total
        count = 0;      //Zera a quantidade de Números
    }

    //Passa o para a próxima posição do vetor
    private void proximoNumero(){
        count = 0;  //Zera a quantidade de Números
        i = 1;      //Passa para o primeiro numero do vetor
    }
}
