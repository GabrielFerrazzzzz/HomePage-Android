package br.com.ferraz.myapplication

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import br.com.ferraz.myapplication.ui.theme.MyFirstApplicationTheme
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ferraz.myapplication.ui.theme.Playfair_Medium_Italic
import br.com.ferraz.myapplication.ui.theme.Playfair_Regular
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.DarkGray
                ) {
                    Greetings()
                }
            }
        }
    }
}

@Composable
fun Greetings() {

    //Variaveis
    var nome_pessoa = "Gabriel Ferraz"
    var nome_cidade = "São Paulo"
    var nome_pais = "Brasil"
    var cor_botão = 0xFF8003EE
    var texto_poucoDestaque = 0xFF615E5E // Textos de Baixo Destaque

    //Colunas e Rows
    Column(modifier = Modifier
        .background(color = Color(0xFFFFFFFF))) { // Fundo Geral
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(color = Color(0XFFFFFFFF))) { // Background da Logo Rosto
            Image(painter = painterResource(id = R.drawable.face_icon),
                modifier = Modifier
                    .size(250.dp),
                contentDescription = "Imagem de Perfil")
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color(0xFFFFFFFF))) { // Background do Nome
            Text(text = "${nome_pessoa}",
                color = Color.Black,
                fontWeight = FontWeight(400),
                fontSize = 40.sp,
)
            Text(text = "${nome_cidade}, ${nome_pais}",
                color = Color.Blue,
                fontSize = 20.sp)
            Row (horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                .fillMaxWidth()
                    .offset(y = 5.dp)){
                Image(painter = painterResource(id = R.drawable.baseline_message_24),
                    contentDescription = "Icone de Mensagem",
                )
                Text(modifier = Modifier
                    .offset(x = 8.dp),
                    text = "(11) 99999-9999",
                    color = Color(texto_poucoDestaque),
                    fontSize = 15.sp)
            }

        }
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(25.dp)
                .fillMaxWidth()
                .height(210.dp)
                .border(width = 3.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(40.dp))
                .background(color = Color(cor_botão),
                    shape = RoundedCornerShape(40.dp)
                )) {
            Image(painter = painterResource(id = R.drawable.sino_logo),
                contentDescription = "Logo de Notificação",
                Modifier
                    .size(80.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .background(color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(80.dp)
                    )
                    .border(width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape((80.dp))
                    ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                )) {
                Text(text = "Configurar Alertas",
                    color = Color(cor_botão),
                    fontSize = 15.sp)
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(color = Color(0x8DD6D6D6,),
                    shape = RoundedCornerShape(10.dp)
                )){
            Text(text = "Noticias",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 10.dp),
                color = Color.Black,
                fontFamily = Playfair_Regular,
                fontSize = 20.sp)
            Text(text = "Ver Mais",
                fontStyle = FontStyle.Italic,
                fontFamily = Playfair_Medium_Italic,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 10.dp),
                color = Color(texto_poucoDestaque),
                fontSize = 18.sp,
                letterSpacing = 1.sp)
        }
        Row {
            Column (modifier = Modifier
                .background(color = Color.Black) // Fundo Baixo Esquerda
                .height(220.dp)
                .width(200.dp)){
                Image(painter = painterResource(id = R.drawable.incendio_logo),
                    contentDescription = "Imagem de um incêndio florestal",
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(size = 150.dp))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)){ // Fundo Esquerda Baixo
                    Text(text = "Distância",
                        color = Color.White,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally))
                    Text(text = "22,5km",
                        color = Color(0xFFFF9800),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally))
                }
            }
            Column (modifier = Modifier
                .background(color = Color.Black) // Fundo Baixo Direita
                .height(220.dp)
                .padding(top = 20.dp)
                .fillMaxWidth()){
                Text(text = "Incêndio Próximo",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    color = Color.White,
                    fontSize = 18.sp)
                Text(text = "de ${nome_cidade}",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    color = Color.White,
                    fontSize = 18.sp)
                Text(text = "Classe",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    color = Color.White)
                Text(textAlign = TextAlign.Center,
                    text = "C",
                    modifier = Modifier
                        .offset(y = 2.dp)
                        .background(color = Color.Yellow,
                            shape = RoundedCornerShape(25.dp),
                        )
                        .size(30.dp)
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 4.dp),
                    color = Color(0xFFFF5722),
                    fontWeight = FontWeight(700),
                    fontStyle = FontStyle.Italic,
                    fontSize = 20.sp)
                Spacer(modifier = Modifier
                    .padding(bottom = 30.dp))
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.End)
                    .background(color = Color.Black)){ // Fundo Direita Baixo
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(cor_botão)),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)) {
                        Text(textAlign = TextAlign.Center,
                            text = "Avisar-me se chegar a ${nome_cidade}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(700),
                            color = Color.White)
                    }
                }
            }
        }
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(color = Color(0xFFDFDDDD)) // Cor Fundo
                .fillMaxSize()
                .fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.logo_casa),
                contentDescription = "Ícone de Home",
                modifier = Modifier
                    .size(80.dp)
                    .padding(start = 40.dp))
            Image(painter = painterResource(id = R.drawable.logo_configuracoes),
                contentDescription = "Ícone de Configurações",
                modifier = Modifier
                    .size(110.dp)
                    .padding(end = 40.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun GreetingsPreview() {
    Greetings()

}