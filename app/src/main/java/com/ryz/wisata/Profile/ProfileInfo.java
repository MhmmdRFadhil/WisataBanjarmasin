package com.ryz.wisata.Profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ryz.wisata.R;

import java.net.URL;

public class ProfileInfo extends AppCompatActivity {

    private Button follow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_info);

        follow = findViewById(R.id.btn_follow);
        /* Onclick buat ngarahin kesebuah link
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/fadhiill__/";
                Intent a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse(url));
                startActivity(a);
            }
        });
         */
    }
}
