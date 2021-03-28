package com.ryz.wisata.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ryz.wisata.R;

import java.util.ArrayList;

public class DetailWisata extends AppCompatActivity {

    private ImageView imageDetail;
    private TextView tvNama,tvDetail;
    private Button favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        imageDetail = findViewById(R.id.img_detail);
        tvNama = findViewById(R.id.tv_nama);
        tvDetail = findViewById(R.id.tv_detail);
        favorite = findViewById(R.id.btn_fav);

        imageDetail.setImageResource(getIntent().getIntExtra("Gambar",0));
        tvNama.setText(getIntent().getStringExtra("Nama"));
        tvDetail.setText(getIntent().getStringExtra("Detail"));
        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailWisata.this, "Terima kasih sudah menambahkan sebagai favorite", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
