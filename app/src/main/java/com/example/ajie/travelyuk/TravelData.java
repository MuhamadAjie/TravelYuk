package com.example.ajie.travelyuk;

import java.util.ArrayList;

class TravelData {
    private static String[] wisataNames = {
            "Danau Toba",
            "Candi Borobudur",
            "Candi Prambanan",
            "Pulau Komodo",
            "Danau Kelimutu",
            "Puncak Jaya Wijaya",
            "Gunung Bromo",
            "Gunung Krakatau",
            "Rumah Adat Toraja",
            "Pulau Bali"
    };

    private static String[] wisataDetails = {
            "Danau toba adalah danau vulkanik dengan panjang kurang lebih 100 kilometer dan juga lebar 30 kilometer yang terletak di Provinsi Sumatera Utara. Keindahan danau toba bukan hanya karena luasnya, namun ada pulau kecil berada di tengah danau toba, pulau vulkanik ini bernama Pulau Samosir. Dana toba menjadi daerah tujuan wisata dunia sejak lama karena keindahan dan juga sejarahnya, yang menurut para ahli bahwa danau toba diperkirakan meletus 73 ribu tahun yang lalu, dan sekaligus tercatat sebagai letusan gunung api terbesar di dunia yang juga mempengaruhi seluruh iklim di dunia.",
            "Candi yang satu ini memang sudah sangat terkenal di seluruh dunia, selain menjadi keajaiban dunia candi borobudur memiliki bangunan yang memang megah dan juga sangat besar pada zamannya. Candi ini dibangun pada masa dinasti Syailendra ketika memerinta di Jawa Tengah. Candi yang terletak di Jawa Tengah tepatnya di Magelang ini memang memiliki bentuk yang sangat menawan dan juga kerumitan dari penyusunan batu-batu hingga menjadi sebuah candi yang megah.",
            "Jika sebelumnya kita sudah mengenal candi borobudur yang berada di Jawa Tengah khususnya di Magelang, salah satu candi yang juga masuk dalam daftar keajaiban dunia adalah candi prambanan. Candi ini adalah candi umat Hindu terbesar se asia tenggara, sehingga tidak mengherankan kalau candi ini selalu ramai dikunjungi wisatawan baik lokal maupun wisatawan mancanegara. Candi ini di bangun pada tahun 850 masehi dengan arsitektur yang tinggi dan megah.",
            "Pulau yang satu ini memang sudah banyak dikenali wisatawan mancanegara, selain komodo adalah hewan yang dipercaya hewan purba, komodo juga hanya terdapat dipulau komodo sehingga banyak wisatawan asing dan lokal yang sangat penasaran untuk melihat hewan purba kala ini secara langsung. Selain hewan komodo menjadi pesona, keindahan alam dari pulau komodo memang menjadi salah satu daya tarik tersendiri bagi turis asing untuk mengunjungi pulau ini. Pulau yang masuk dalam kepulauan Nusa Tenggara Barat saat ini memang menjadi salah satu tujuan wisatawan asing dan juga masuk dalam daftar keajaiban dunia.",
            "Danau keliumutu atau yang biasa dikenal dengan nama danau tiga warna memiliki pesona yang sangat luar biasa untuk dikunjungi. Danau yang terletak di Flores NTT ini terdiri dari 3 danau yang masing-masing danau memiliki warna-warna yang berbeda, dan bahkan dalam waktu-waktu tertentu danau ini dapat berubah warna. Danau ini ditemukan pada tahun 1915 dan mulai populer sejak tahun 1929, banyak orang mulai mengunjungi danau 3 warna ini, selain untuk menkmati keindahan danau juga banyak peneliti dari berbagai negara juga melakukan penelitian terhadap 3 danau ini.",
            "Keindahan alam Indonesia merupakan salah satu hal yang menjadi kekayaan Indonesia, dari mulai ujung barat Indonesia hingga ujung timur Indonesia, salah satu keindahan alam dan juga menjadi daya tarik bagi wisatawan asing adalah puncak jaya wijaya di Papua. Indonesia dengan iklim tropis yang sangat kecil kemungkinan untuk bisa turun salju namun juga terdapat salju dipegunungan ini. Puncak jaya wijaya masuk sebagai daftar keajaiban dunia dan menjadi incaran pendaki gunung seluruh dunia. Pegunungan ini masuk dalam taman nasional, yaitu Taman Nasional Lauentz Papua, dan puncak jayawijaya ini menjadi salah satu puncak bersalju dan puncak tertinggi diasia tenggara.",
            "Gunung yang satu ini memang memiliki pesona yang sangat cantik, gunung dengan padang pasir yang membentang dan menjadikan keindahan dan pesoa gunung bromo semakin terasa. Gunung ini juga tercatat dalam sejarah mengalami sangat banyak kali letusan. Beberapa kali letusan dan letusan terbesar pada tahun 1973. Wisatawan bisa menikmati beberapa keindahan seperti keindahan pemandangan kawah gunung bromo, keindahan kaki gununug bromo, dan juga padang pasir yang memang sangat jarang bisa ditemukan di Indonesia, padang pasir dengan suasana seperti ditimur tengah hanya bisa dinikmati di Gunung Bromo.",
            "Gunung krakatau adalah salah satu gunung berapi yang sangat fenomenal dan sangat terkenal di Indonesia dan di dunia, salah satu letusan yang sangat fenomenal terjadi pada tanggah 26 agustus tahun 1883 yang letusannya menyebabkan gelombang tsunami dan juga menewaskan sekitar 36.000 jiwa. Kedahsyatan letusan gunung krakatau hingga terdengar sampa ke asutralia dan pulau Rodrigues di dekat Afrika. Bahkan beberapa sumber mengatakan debu dari letusan gunung krakatau sampai keluar angkasa.",
            "Keajaiban dunia yang berada di Indonesia berikutnya ada didaerah sulawesi selatan, tanah toraja terkenal dengan keunikannya terutama dalam hal pemakamannya, disini mayat-mayat tidak dkubur melainkan diletakkan dalam gua batu. Dalam gua tersebut dibuat patung-patung yang seakan menemani si mayat, salah satu yang menarik perhatian pengunjung adalah kuburan batu yang dibuat diatas tebing. Menurut kepercayaan orang toraja, semakin tinggi tempat diletakkannya mayat maka semakin cepat rohnya bertemu dengan tuhan.",
            "Pulau yang merupakan salah satu pulau terindah di Indonesia ini menjadi daya tarik wisatawan dunia maupun olokal, pulau ini juga memiliki banyak pesona tidak hanya pantai dan laut saja, melainkan budaya dan juga keindahan alam pulau bali juga menjadi salah satu keunggulan dan juga menjadi pemikat para wisatawan. Pulau bali sendiri juga menjadi salah satu pulau terindah didunia, sehinga tidak mengherankan jika pulau bali sangat terkenal dan sangat ramai pengunjung baik dari wisatawan lokal maupun wisatawan mancanegara. Pulau bali juga memiliki banyak objek wisata yang bisa dikunjung seperti, pantai kuta, danau batur, tanah lot, goa gajah dan masih banyak lagi. Pulau bali masuk dalam daftar keajaiban dunia karena keindahan pulau dan juga arsitektur bangunan sekaligus keindahan alam pulau bali"
    };

    private static int[] wisataImages = {
            R.drawable.danau_toba,
            R.drawable.candi_borobudur,
            R.drawable.candi_prambanan,
            R.drawable.pulau_komodo,
            R.drawable.danau_kelimutu,
            R.drawable.puncak_jaya_wijaya,
            R.drawable.gunung_bromo,
            R.drawable.gunung_krakatau,
            R.drawable.rumah_adat_toraja,
            R.drawable.pulau_bali
    };

    static ArrayList<Travel> getListData() {
        ArrayList<Travel> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Travel wisata = new Travel();
            wisata.setName(wisataNames[position]);
            wisata.setDetail(wisataDetails[position]);
            wisata.setPhoto(wisataImages[position]);
            list.add(wisata);
        }
        return list;
    }
}
