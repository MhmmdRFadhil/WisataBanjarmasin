package com.ryz.wisata.RecyclerView;

import com.ryz.wisata.R;

import java.util.ArrayList;

public class WisataData {

    private static String[] namaWisata = {

            "Bukit Matang Kaladan",
            "Bukit Rimpi",
            "Puncak Hutan Tahura",
            "Air Terjun Bajuin",
            "Air Terjun Mandin Damar",
            "Danau Biru Cempaka",
            "Pantai Birah Birahan",
            "Taman Labirin",
            "Pulau Kembang",
            "Pasar Terapung Lok Baintan",
    };

    private static String[] detailNamaWisata = {

            "Terletak di kawasan Riam Kanan, Banjarbaru, Bukit Matang Kaladan adalah atraksi wisata alam yang menyuguhkan kompleks perbukitan hijau. Yang menarik, perbukitan ini mengelilingi danau di tengahnya, konsep serupa yang ditawarkan oleh Pulau Wayag di Raja Ampat.",
            "Bukit Rimpi merupakan sebuah perbukitan yang ditumbuhi oleh padang savana hijau yang dihiasi oleh hamparan rumput dengan pemandangannya yang sangat elok. Bukit cantik ini lebih dikenal dengan sebutan Bukit Teletubies karena gundukan bukitnya yang menjulang seperti layaknya di film Teletubies. Terletak di Pelaihari, Kabupaten Tanah Laut, akses menuju lokasi bukit ini dapat ditempuh sekitar 30 menit dari Kota Pelaihari dan sekitar 2 jam apabila ditempuh dari Kota Banjarmasin.",
            "Melakukan kegiatan camping atau berkemah di Puncak Tahura Mandiangin saat weekend bukanlah ide yang buruk, melainkan ide yang ciamik guys. Bagaiamana tidak! Tahura (Taman Hutan Raya) Mandiangin yang terletak di Kabupaten Banjar, Provinsi Kalimantan Selatan ini menawarkan banyak spot menarik untuk bersantai maupun berfoto. Di sana ada air terjun, view perbukitan yang berjejer, kolam Belanda untuk berenang, dll.",
            "Air Terjun Bajuin ini terletak di Desa Sungai Bakar, Kecamatan Pelaihari yang berjarak sekitar 10 km dari Ibu Kota Kabupaten Tanah Laut dan sekitar 75 km dari Banjarmasin. Berjarak sekitar ± 10 km dari Kota Pelaihari (2,5 jam waktu perjalanan) atau sekitar 75 km dari Kota Banjarmasin. Kondisi jalan menuju air terjun ini beraspal (sampai Desa Sei Bakar) dan ada juga jalan setapaknya. Sepanjang jalan tersebut banyak terdapat perbukitan besar mirip gunung. Warnanya yang hijau terlihat cantik berpadu dengan menguningnya persawahan disekitarnya.",
            "Jauh di pedalaman hutan Kalimantan Selatan, tak hanya menyimpan berbagai pesona flora dan fauna khas hutan topis Pulau Borneo, namun juga air terjunnya yang menyegarkan. Air terjun itu mengaliri sungai-sungai, jatuh menghempas dari ketinggian, menciptkana pesona alam tersendiri. Salah satu nya adalah Air Terjun Mandin Damar, yang berada di Desa Gunung Raya, Kecamatan Mentewe, Kabupaten Tanah Bumbu, Kalimantan Selatan.",
            "Danau biru adalah salah satu lokasi wisata instagramable di Banjarbaru, Kalimantan Selatan. Danau biru sudah lama da selama ini, namun kini dipercantik dengan beragam fasilitas. Dinamakan danau biru karena airnya berwarna biru, selain itu di lokasi juga ada wisata burung karena di kawasan itu dihuni ratusan burung merpati yang jinak.",
            "Pulau Birah Birahan terletak di antara kecamatan Pulau Laut kepulauan dengan kecamatan Pulau Sembilan. Pulau ini terbilang masih baru, tidak seperti saudara nya yang sudah terkenal luas, yaiut Pulau Samber Gelap. Namun keduanya sama-sama sangat bagus dan memiliki ciri khas masing-masing. Sebagai pulau yang terletak jauh di selatan Kotabaru tentu ada harga dan waktu yang lumayan yang harus di bayar untuk sampai ketempat wisata ini.",
            "Taman Labirin adalah alah satu tempat wisata buatan berupa taman yang terletak di Tambang Ulang, Tanah Laut, Kalimantan Selatan. Daya tarik utama tempat wisata ini adalah sensasi memasuki lorong lorong labirin dari tumbuhan dengan tujuan mencari jalan keluar. Pada lokasi yang sama pengunjung juga dapat melihat rusa tutul dan menikmati danau buatan. Pengunjung juga dapat befoto dari atas dengan latar belakang labirin di atas menara setinggi 3,5 m",
            "Pulau Kembang adalah sebuah delta yang terletak di tengah sungai Barito yang termasuk di dalam wilayah administratif kecamatan Alalak, Kabupaten Barito Kuala, provinsi Kalimantan Selatan. Pulau Kembang terletak di sebelah barat Kota Banjarmasin. Pulau Kembang ditetapkan sebagai hutan wisata berdasarkan SK.",
            "Pasar Terapung Lok Baintan atau Pasar Terapung Sungai Martapura adalah sebuah pasar terapung tradisional yang berlokasi di desa Sungai Pinang (Lok Baintan), kecamatan Sungai Tabuk, Banjar. Pasar tradisional yang berada di atas jukung ini menjual beragam dagangan, seperti hasil produksi pertanian/perkebunan dan berlangsung tidak terlalu lama, paling lama sekitar tiga hingga empat jam. Pasar terapung ini sudah ada sejak zaman Kesultanan Banjar. Pulau Kembang adalah sebuah delta yang terletak di tengah sungai Barito yang termasuk di dalam wilayah administratif kecamatan Alalak, Kabupaten Barito Kuala, provinsi Kalimantan Selatan.",
    };

    private static int[] gambarWisata = {

            R.drawable.wisata_1,
            R.drawable.wisata_2,
            R.drawable.wisata_3,
            R.drawable.wisata_4,
            R.drawable.wisata_5,
            R.drawable.wisata_6,
            R.drawable.wisata_7,
            R.drawable.wisata_8,
            R.drawable.wisata_9,
            R.drawable.wisata_10
    };

    public static ArrayList<Wisata> getListData() {

        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < namaWisata.length; position++) {

            Wisata wisata = new Wisata();
            wisata.setTvList(namaWisata[position]);
            wisata.setTvDetail(detailNamaWisata[position]);
            wisata.setBgList(gambarWisata[position]);
            list.add(wisata);
        }

        return list;
    }

}
