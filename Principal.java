package gabriela.quiz;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Button btn;//Instânciando
    EditText num1;
    EditText num2;
    EditText num3;
    EditText num4;
    EditText num5;
    EditText num6;
    TextView resultado;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView txt6;
    TextView r1;
    TextView r2;
    TextView r3;
    TextView r4;
    TextView r5;
    TextView r6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        resultado = (TextView)findViewById(R.id.idqq);
        num1 = (EditText) findViewById(R.id.editText1);//Pegando valores pelas ids
        num2 = (EditText) findViewById(R.id.editText2);
        num3 = (EditText) findViewById(R.id.editText3);
        num4 = (EditText) findViewById(R.id.editText4);
        num5 = (EditText) findViewById(R.id.editText5);
        num6 = (EditText) findViewById(R.id.editText6);
        txt1 = (TextView)findViewById(R.id.txt1);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt3 = (TextView)findViewById(R.id.txt3);
        txt4 = (TextView)findViewById(R.id.txt4);
        txt5 = (TextView)findViewById(R.id.txt5);
        txt6 = (TextView)findViewById(R.id.txt6);
        r1 = (TextView)findViewById(R.id.r1);
        r2 = (TextView)findViewById(R.id.r2);
        r3 = (TextView)findViewById(R.id.r3);
        r4 = (TextView)findViewById(R.id.r4);
        r5 = (TextView)findViewById(R.id.r5);
        r6 = (TextView)findViewById(R.id.r6);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            Double contador = 0.00;
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(View v) {//Onclick do botão
                if (num1.getText().toString().trim().isEmpty()) {//Conferindo se o campo não é nulo
                    num1.setError("Campo Obrigatório");//Emitindo uma mensagem
                    num1.requestFocus();//Dando foco
                }
                if(num1.getText().toString().trim().equals("É uma variavél constante")){//Conferindo se o que foi digitado condiz com a resposta certa
                    contador = 1.00;//contador recebendo valor
                    r1.setTextColor(Color.BLUE);
                    txt1.setTextColor(Color.BLUE);
                }else{
                    r1.setTextColor(Color.RED);
                    txt1.setTextColor(Color.RED);
                }

                if (num2.getText().toString().trim().isEmpty()) {
                    num2.setError("Campo Obrigatório");
                    num2.requestFocus();
                }
                if(num2.getText().toString().trim().equals("Não pode ser alterado na classe")){
                    contador = contador + 1.00;
                    r2.setTextColor(Color.BLUE);
                    txt2.setTextColor(Color.BLUE);
                }else{
                    r2.setTextColor(Color.RED);
                    txt2.setTextColor(Color.RED);
                }

                if (num3.getText().toString().trim().isEmpty()) {
                    num3.setError("Campo Obrigatório");
                    num3.requestFocus();
                }
                if(num3.getText().toString().trim().equals("nomedaclassefilha extends nomedaclassemae")){
                    contador = contador + 1.00;
                    r3.setTextColor(Color.BLUE);
                    txt3.setTextColor(Color.BLUE);
                }else{
                    r3.setTextColor(Color.RED);
                    txt3.setTextColor(Color.RED);
                }

                if (num4.getText().toString().trim().isEmpty()) {
                    num4.setError("Campo Obrigatório");
                    num4.requestFocus();
                }
                if(num4.getText().toString().trim().equals("Na principal classe do Android")){
                    contador = contador + 1.00;
                    r4.setTextColor(Color.BLUE);
                    txt4.setTextColor(Color.BLUE);
                }else{
                    r4.setTextColor(Color.RED);
                    txt4.setTextColor(Color.RED);
                }

                if (num5.getText().toString().trim().isEmpty()) {
                    num5.setError("Campo Obrigatório");
                    num5.requestFocus();
                }
                if(num5.getText().toString().trim().equals("É um depurador")){
                    contador = contador + 1.00;
                    r5.setTextColor(Color.BLUE);
                    txt5.setTextColor(Color.BLUE);
                }else{
                    r5.setTextColor(Color.RED);
                    txt5.setTextColor(Color.RED);
                }

                if (num6.getText().toString().trim().isEmpty()) {
                    num6.setError("Campo Obrigatório");
                    num6.requestFocus();
                }
                if(num6.getText().toString().trim().equals("Para se comunicar com outros componentes do sistema")){
                    contador = contador + 1.00;
                    r6.setTextColor(Color.BLUE);
                    txt6.setTextColor(Color.BLUE);
                }else{
                    r6.setTextColor(Color.RED);
                    txt6.setTextColor(Color.RED);
                }
                if(num1.getText().toString().trim().isEmpty() && num2.getText().toString().trim().isEmpty() && num3.getText().toString().trim().isEmpty() && num4.getText().toString().trim().isEmpty()&& num5.getText().toString().trim().isEmpty()&& num6.getText().toString().trim().isEmpty()){

                }else {
                    Double porcentagem = (contador / 6.00) * 100.00;
                    DecimalFormat number = new DecimalFormat("#.00");
                    resultado.setText("Porcentagem :" + String.valueOf(number.format(porcentagem))+ "%  Quantidade de Acertos: " + contador);
                }

            }


        });
    }
}
