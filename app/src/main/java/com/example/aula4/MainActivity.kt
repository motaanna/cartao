package com.example.aula4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula4.ui.theme.Aula4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImagemFundo()

                }
            }
        }
    }
}

@Composable
fun ImagemFundo(){
    val image = painterResource(id = R .drawable .androidparty)
Box(
    Image(
        painter = image ,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

    )

    Cabecalho( "Anna Clara Mota Pedrosa da Silva" , "Estudante ")
}

fun Box(modifier: Unit) {

}


@Composable
fun Cabecalho(nomeCompleto: String, cargo: String, modifier: Modifier = Modifier) {

    Column(
        modifier = modifier .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = nomeCompleto,
            fontSize = 23.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = cargo,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Aula4Theme {

        ImagemFundo()


    }
}