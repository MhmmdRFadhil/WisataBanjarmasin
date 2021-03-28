package com.ryz.wisata.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryz.wisata.R;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ListViewHolder> {

    private ArrayList<Wisata> listWisata;
    private Context context;

    public WisataAdapter(ArrayList<Wisata> listWisata, Context context) {
        this.listWisata = listWisata;
        this.context = context;
    }

    @NonNull
    @Override
    public WisataAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_wisata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final WisataAdapter.ListViewHolder holder, final int position) {

        final Wisata wisata = listWisata.get(position);
        holder.img_list.setImageResource(wisata.getBgList());
        holder.tv_list.setText(wisata.getTvList());
        holder.img_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, DetailWisata.class);
                a.putExtra("Gambar", listWisata.get(position).getBgList());
                a.putExtra("Nama", listWisata.get(position).getTvList());
                a.putExtra("Detail",listWisata.get(position).getTvDetail());
                context.startActivity(a);


            }
        });

    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_list;
        private TextView tv_list;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            img_list = itemView.findViewById(R.id.bg_list);
            tv_list = itemView.findViewById(R.id.tv_list);


        }
    }
}
