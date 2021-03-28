package com.ryz.wisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ryz.wisata.Profile.ProfileInfo;
import com.ryz.wisata.RecyclerView.Wisata;
import com.ryz.wisata.RecyclerView.WisataAdapter;
import com.ryz.wisata.RecyclerView.WisataData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvWisata;
    private ArrayList<Wisata> list = new ArrayList<>();
    private ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, ProfileInfo.class);
                startActivity(a);
            }
        });

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerViewWisata();

    }

    private void showRecyclerViewWisata() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        WisataAdapter wisataAdapter = new WisataAdapter(list, this);
        rvWisata.setAdapter(wisataAdapter);
    }
}