package com.example.praktikum1

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)){
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier){
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Box 2")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier){
    Column(){
      //baris1
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Text(text = "Kompenen1Baris1")
            Text(text = "Kompenen2Baris1")
            Text(text = "Kompenen3Baris1")
        }
        //baris2
        Row (modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Kompenen1Baris2")
            Text(text = "Kompenen2Baris2")
            Text(text = "Kompenen3Baris2")
        }
    }
}
@Composable
fun TataletakRowColumn(modifier: Modifier){
    Row (modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
        //kolom1
        Column(){
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        //kolom2
        Column() {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}
@Composable
fun TataletakBoxColumnRow(modifier: Modifier){
    val gambar = painterResource(id = R.drawable.ryan)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.Yellow)
                .padding(horizontal = 12.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Col1_Row1_Komponen1",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Col1_Row1_Komponen2",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Col1_Row1_Komponen3",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Col1_Row2_Komponen1",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Col1_Row2_Komponen2",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Col1_Row2_Komponen3",
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(horizontal = 16.dp) // ✅ tambahan padding kiri/kanan
                .clip(RoundedCornerShape(16.dp)) // ✅ sudut membulat
                .border(1.dp, Color(0xFFE0E0E0), RoundedCornerShape(16.dp)) // ✅ border tipis
                .background(Color(0xFFEFF3F6)), // ✅ warna netral lebih enak dilihat
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = "Gambar musik",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop // ✅ ganti agar proporsional
            )
            Text(
                text = "My Music",
                fontSize = 50.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center) // ✅ pastikan center
            )
        }

    }
}


















