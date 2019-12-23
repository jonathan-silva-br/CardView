package com.example.cardview.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.cardview.R;
import com.example.cardview.adapter.Adapter;
import com.example.cardview.model.Postagem;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagens = new ArrayList<>();

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Define o Layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);//exibe os cards lateralmente;
        //LinearLayoutManager layoutManager = new GridLayoutManager(this, 2); exibe os cards em colunas;
        recyclerView.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();
        Adapter adapter = new Adapter(postagens);
        recyclerView.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Jonathan Silva", "#tbt viagem boa!", R.drawable.imagem1);
        this.postagens.add(p);
        p = new Postagem("Hotel Blumenau", "Aproveite nossos descontos!", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Bruna Martendal", "#Paris!!!", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Julia Silva", "Que fotão!", R.drawable.imagem4);
        this.postagens.add(p);

    }
}
