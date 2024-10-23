package com.example.latihan3

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text


@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column (modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(start = 10.dp))
        Text(text = "Farhan D'jafar",
            modifier = Modifier.padding(start = 10.dp, top = 10.dp))
        Spacer(modifier = Modifier.padding(30.dp))
        DetailSurat(
            judul = "Nama",
            isi = "Ilzam Roin Musyafa"
        )
        DetailSurat(
            judul = "Email",
            isi = "ijammusyaf@gmail.com"
        )
        DetailSurat(
            judul = "NoTlp",
            isi = "20220140018"
        )
        DetailSurat(
            judul = "Keterangan",
            isi = "hai kawan"
        )
    }
}

@Composable
fun HeaderSection() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)
        .padding(15.dp)
    ){
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = "Daerah Istimewa Yogyakarta",
                color = Color.White
                )
                Text(
                    text = "FAX : 021-12121212 Tlp : 0811212",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.umyeah),
                    contentDescription = " ",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                    )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                )
            }
        }
    }
}
@Composable
fun DetailSurat(
    judul: String, isi: String
){
    Column (modifier = Modifier.fillMaxWidth().padding(15.dp),
    ){


        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.1f))
            Text(text = isi,
                modifier = Modifier.weight(2f))
        }
    }
}