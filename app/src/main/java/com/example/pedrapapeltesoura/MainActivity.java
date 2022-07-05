package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selecionadoPedra(View view) {

        System.out.println("selecionado Pedra");
        this.opcaoSelecionada("pedra");

    }

    public void selecionadoPapel(View view) {
        System.out.println("selecionado Papel");
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        System.out.println("selecionado Tesoura");
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario) {


        ImageView resultado = findViewById(R.id.resultado);
        TextView textresultado = findViewById(R.id.escolha);


        int num = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoapp = opcoes[num];


        switch (opcaoapp) {
            case "pedra":
                resultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                resultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura);
                break;

        }

        if(
            (opcaoapp == "tesoura" && escolhaUsuario =="papel" ) ||
            (opcaoapp == "papel" && escolhaUsuario == "pedra") ||
            (opcaoapp == "pedra" && escolhaUsuario== "tesoura")

        ){//app ganhador
            textresultado.setText("Você perdeu =(");



        }else if ((opcaoapp == "tesoura" && escolhaUsuario =="pedra" ) ||
        (opcaoapp == "papel" && escolhaUsuario == "tesoura") ||
        (opcaoapp == "pedra" && escolhaUsuario == "papel")

        ){//usuario ganhador
           textresultado.setText("Você Ganhou =) ");

        }else{//empate
            textresultado.setText("Empatamos, Vou melhorar para te vencer.");


        }



    }

}
