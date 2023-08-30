package com.example.aulapam.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreem() {
    Column () {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(19.dp))
        {
            Text(text = "Deus")
            Text("TextoDaMainScreen")
            Row(){
                Button(onClick = {
                    Log.i("###", "Botão! Clicado!")
                }){
                    Text("Btn1")
                }
                Spacer(
                    modifier = Modifier
                    .width(20.dp
                    )
                )
                Button(onClick = { /*TODO*/ }){
                    Log.i("### fun MainScreen(){...", "Botão! Clicado!")
                    Text("Navegar para TaskScreen")
                }
            }
        }
    }
}