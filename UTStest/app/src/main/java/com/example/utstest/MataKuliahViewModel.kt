package com.example.utstest
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class MataKuliahViewModel : ViewModel() {
    val mataKuliahList = mutableStateListOf(
        MataKuliah("Basis Data", R.drawable.basdat, 3),
        MataKuliah("Dasar Dasar Programming", R.drawable.ddp, 4),
        MataKuliah("Etika Profesi", R.drawable.etprof, 3),
        MataKuliah("Interaksi Manusia", R.drawable.hci, 4),
        MataKuliah("Manajemen Proyek", R.drawable.manpro, 3),
        MataKuliah("Metode Penelitian", R.drawable.metlin, 4),
        MataKuliah("Mobile Computing", R.drawable.mobcom, 3),
        MataKuliah("Sistem Operasi", R.drawable.os, 4),
        MataKuliah("Pengantar Kecerdasan Buatan", R.drawable.pkb, 3),
        MataKuliah("Perancangan dan Pemograman Web", R.drawable.ppw, 4),
    )
}