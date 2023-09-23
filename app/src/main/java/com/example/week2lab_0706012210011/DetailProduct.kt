package com.example.week2lab_0706012210011

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2lab_0706012210011.ui.theme.Week2Lab_0706012210011Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Lab_0706012210011Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    DetailProduk()
                }
            }
        }
    }
}

@Composable
fun DetailProduk() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "Arrow Back",
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "McDonald's",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 5.dp),
                fontFamily = poppins,
                color = Color(0xFFFFC72C)
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_view_headline_24),
                contentDescription = "View Headline",
                modifier = Modifier.padding(10.dp),
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.burger),
                contentDescription = "Burger",
                modifier = Modifier
                    .padding(horizontal = 100.dp)
                    .size(300.dp),
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(0xFFDA291C), shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                )
                .padding(top = 5.dp)
        ) {
            Column(modifier = Modifier.padding()) {
                Text(
                    text = "Whopper Jr. Wareg",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                        .fillMaxWidth(),
                    color = Color.White,
                    fontFamily = poppins,
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_star_24),
                        contentDescription = "Review Star",
                        modifier = Modifier.padding(top = 2.dp),
                    )
                    Text(
                        text = "5.0 (329 reviews)",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 20.dp, top = 3.dp),
                        color = Color.White,
                        fontFamily = poppins
                    )
                }

                Text(
                    text = "Whopper, just Whopper, known for its flame-grilled beef patty, fresh ingredients, and signature sesame seed bun, making it a classic choice for burger enthusiasts worldwide.",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(vertical = 10.dp, horizontal = 20.dp),
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    fontFamily = poppins
                )
                Text(
                    text = "See More...",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 20.dp),
                    color = Color.White,
                    textAlign = TextAlign.Justify,
                    fontFamily = poppins,
                    textDecoration = TextDecoration.Underline
                )
                Row(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = "Rp. 50.000,-",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 30.dp, start = 20.dp, end = 20.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontFamily = poppins
                    )
                    Text(
                        text = "Add to Cart",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .weight(1f)
                            .padding(top = 20.dp, end = 20.dp)
                            .background(Color(0xFFFFC72C), shape = RoundedCornerShape(15.dp))
                            .padding(10.dp),
                        color = Color(0xFFDA291C),
                        textAlign = TextAlign.Center,
                        fontFamily = poppins
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailProductView() {
    Week2Lab_0706012210011Theme {
        DetailProduk()
    }
}

private val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)