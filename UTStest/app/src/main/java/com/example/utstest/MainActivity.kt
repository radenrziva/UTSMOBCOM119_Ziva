package com.example.utstest

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utstest.ui.theme.UTStestTheme
import androidx.lifecycle.viewmodel.compose.viewModel

data class MataKuliah(val nama: String, val img: Int, val sks: Int)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTStestTheme {
                LazyGridList(context = this)
            }
        }
    }
}

@Composable
fun LazyGridList(context: Context){
    val viewModel: MataKuliahViewModel = viewModel()
    val mataKuliahList = viewModel.mataKuliahList

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(mataKuliahList) { mataKuliah ->
                MataKuliahItem(mataKuliah)
            }
        }
    }
}

@Composable
fun MataKuliahItem(mataKuliah: MataKuliah) {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = mataKuliah.img),
            contentDescription = null, // Deskripsi bisa diisi sesuai kebutuhan
            modifier = Modifier.size(100.dp) // Ubah ukuran ikon sesuai kebutuhan
        )
        Text(text = mataKuliah.nama, fontSize = 16.sp)
        Text(text = "SKS: ${mataKuliah.sks}", fontSize = 14.sp)
    }
}
