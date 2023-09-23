package com.example.week2lab_0706012210011

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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

class ListProduct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Lab_0706012210011Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
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
                text = "Your Cart",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(vertical = 5.dp),
                fontFamily = poppins
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_view_headline_24),
                contentDescription = "View Headline",
                modifier = Modifier.padding(10.dp),
            )
        }

        CartRow("Plant Based Whopper", "5", "12.000", 8, R.drawable.burger1)
        Divider_butFun()
        CartRow("Extra Spicy Chicken Burger", "10", "36.000", 8, R.drawable.burger2)
        Divider_butFun()
        CartRow("BBQ Beef Rasher", "7", "30.000", 8, R.drawable.burger3)
        Divider_butFun()

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Delivery Charges",
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 15.dp, top = 5.dp),
                fontFamily = poppins
            )
            Text(
                text = "Free Delivery",
                fontSize = 12.sp,
                modifier = Modifier.padding(end = 15.dp, top = 5.dp),
                fontFamily = poppins,
                textDecoration = TextDecoration.Underline
            )
        }

        Divider_butFun()
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Total Amount",
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 15.dp, top = 5.dp),
                fontFamily = poppins
            )
            Text(
                text = "Rp 78.000,-",
                fontSize = 12.sp,
                modifier = Modifier.padding(end = 15.dp, top = 5.dp),
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
            )
        }
        Divider_butFun()

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Rp 78.000,-",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 15.dp, top = 5.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .padding(vertical = 10.dp, horizontal = 30.dp),
                fontFamily = poppins,
            )

            Text(
                text = "Continue",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(end = 15.dp, top = 5.dp)
                    .background(
                        color = Color.Black,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .padding(vertical = 10.dp, horizontal = 50.dp),
                fontFamily = poppins,
                color = Color.White
            )
        }
    }
}


@Composable
fun CartRow(burger_name: String, rate: String, price: String, amount: Int, drawableResId: Int) {
    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = drawableResId),
            contentDescription = "Burger",
            modifier = Modifier
                .size(150.dp)
                .clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )
        Column {
            Text(
                text = "Krabby Patty",
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                fontFamily = poppins
            )
            Text(
                text = burger_name,
                fontSize = 16.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(top = 5.dp, start = 10.dp),
                fontFamily = poppins
            )
            Row {
                Text(
                    text = "Rate-",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 10.dp),
                    fontFamily = poppins
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "*",
                    modifier = Modifier
                        .size(20.dp)
                        .padding(top = 8.dp),
                )
                Text(
                    text = "Spicy Level-$rate/10",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 3.dp),
                    fontFamily = poppins
                )
            }
            Text(
                text = "Rp. $price,-",
                fontSize = 12.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 10.dp),
                fontFamily = poppins
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "+ $amount -",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(start = 10.dp, top = 5.dp),
                    fontFamily = poppins
                )
                Image(
                    painter = painterResource(id = R.drawable.red_close),
                    contentDescription = "*",
                    modifier = Modifier
                        .width(160.dp)
                        .padding(start = 140.dp, top = 5.dp),
                )
            }
        }
    }


}

@Composable
fun Divider_butFun() {
    Divider(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 5.dp)
            .height(2.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ListProductView() {
    Week2Lab_0706012210011Theme {
        Greeting("Android")
    }
}

private val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)