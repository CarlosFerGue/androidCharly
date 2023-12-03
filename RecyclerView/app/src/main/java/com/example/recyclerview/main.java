 package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class main extends AppCompatActivity {
    ArrayList<recyclerview_list> recyclerview_lists;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        recyclerview_lists = new ArrayList<recyclerview_list>();
        recyclerview_lists.add(new recyclerview_list(R.drawable.cara, "math"));
        recyclerview_lists.add(new recyclerview_list(R.drawable.porque, "math"));
        recyclerview_lists.add(new recyclerview_list(R.drawable.cara, "math"));
        recyclerview_lists.add(new recyclerview_list(R.drawable.porque, "math"));

        recyclerview_adapter recyclerview_adapter = new recyclerview_adapter(recyclerview_lists, this);
        recyclerView.setAdapter(recyclerview_adapter);
    }
}