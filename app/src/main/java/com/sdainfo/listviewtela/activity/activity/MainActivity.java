package com.sdainfo.listviewtela.activity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sdainfo.listviewtela.R;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] itensLista = {"Acre - AC ","Alagoas - AL","Amapá - AP ","Amazonas - AM ",
            "Bahia - BA ","Ceará - CE ","Distrito Federal - DF ","Espírito Santo - ES ","Goiás - GO ","Maranhão - MA ",
            "Mato Grosso - MT ","Mato Grosso do Sul - MS ","Minas Gerais - MG ","Pará - PA ","Paraíba - PB ","Paraná - PR ",
            "Pernambuco - PE ","Piauí - PI ","Rio de Janeiro - RJ ","Rio Grande do Norte - RN ","Rio Grande do Sul - RS ",
            "Rondônia - RO ","Roraima - RR ","Santa Catarina - SC ","São Paulo - SP ","Sergipe - SE ","Tocantins - TO "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.list_view);

        //adaptador de dados pra view
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, itensLista);


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicaoToque, long l) {
                String posicaoLista = String.valueOf(listView.getItemAtPosition(posicaoToque));
                Toast.makeText(getApplicationContext(), posicaoLista, Toast.LENGTH_SHORT).show();


            }
        });


    }

}