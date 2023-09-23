package com.example.week2lab_0706012210011

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2lab_0706012210011.ui.theme.Week2Lab_0706012210011Theme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Lab_0706012210011Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Profile("Android")
                }
            }
        }
    }
}

@Composable
fun Profile(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFF181CCC),
            )
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SmolIcon(
                R.drawable.white_arrow_back, Modifier
                    .padding(25.dp)
                    .size(30.dp)
            )
            Title("Profile", FontWeight.SemiBold, Color.White, Modifier.padding(vertical = 25.dp))
            SmolIcon(
                R.drawable.baseline_edit_24, Modifier
                    .padding(25.dp)
                    .size(30.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxHeight(),
            ) {
                Title(
                    "Evan Tanuwijaya",
                    FontWeight.Bold,
                    Color.White,
                    Modifier.padding(top = 25.dp)
                )
                SubTitle("Ciputra University", FontWeight.Light, Color.White)
            }

            Image(
                painter = painterResource(id = R.drawable.cat_burger),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(110.dp)
                    .clip(RoundedCornerShape(100.dp)),
                contentScale = ContentScale.Crop
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 50.dp)
                .background(color = Color.White)
                .offset(y = (-40).dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(25.dp))
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(25.dp)
                    )
            ) {
                Column(modifier = Modifier.padding(25.dp)) {
                    Title("Personal Data", FontWeight.Bold, Color.Black)
                    DividerInBox()
                    Row(modifier = Modifier.fillMaxSize()) {
                        PersonalDataText("NIDN", "0123456789", Modifier.padding(end = 50.dp))
                        PersonalDataText("Date Of Birth", "1 January 1996")
                    }
                    Row(modifier = Modifier.fillMaxSize()) {
                        PersonalDataText("Occupation", "Lecturer", Modifier.padding(end = 50.dp))
                        PersonalDataText("Marital Status", "Single")
                    }
                    Row(modifier = Modifier.fillMaxSize()) {
                        PersonalDataText("Email", "evan.tanuwijaya@ciputra.ac.id")
                    }
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, top = 350.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(25.dp))
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(25.dp)
                    )
            ) {
                Column(modifier = Modifier.padding(25.dp)) {
                    Title("Expertise", FontWeight.Bold, Color.Black)
                    DividerInBox()

                    Expertise(
                        R.drawable.androidstudio_logo,
                        "Android Development",
                        Modifier.padding(top = 15.dp, start = 10.dp)
                    )
                    Expertise(
                        R.drawable.oop_logo,
                        "Object Oriented Programming",
                        Modifier.padding(top = 5.dp, start = 10.dp)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, top = 610.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(25.dp))
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(25.dp)
                    )
            ) {
                Column(modifier = Modifier.padding(25.dp)) {
                    Title("Send A Message", FontWeight.Bold, Color.Black)
                    DividerInBox()

                    Text(
                        text = "Write A Message",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(25.dp)
                            )
                            .border(
                                width = 1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(25.dp)
                            )
                            .padding(15.dp),
                        fontFamily = poppins,
                    )
                    Row(
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Send",
                            textAlign = TextAlign.Center,
                            fontSize = 16.sp,
                            color = Color.White,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentSize(Alignment.Center)
                                .padding(top = 15.dp)
                                .background(
                                    color = Color(0xFF181CCC),
                                    shape = RoundedCornerShape(25.dp)
                                )
                                .padding(vertical = 10.dp, horizontal = 30.dp),
                            fontFamily = poppins,
                        )
                    }

                }
            }
        }

    }
}


@Composable
fun SmolIcon(drawableResId: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = drawableResId),
        contentDescription = "Icons Cute",
        modifier = modifier
    )
}

@Composable
fun DividerInBox() {
    Divider(
        color = Color.Gray,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
    )
}

@Composable
fun Title(text: String, fontweight: FontWeight, color: Color, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 22.sp,
        fontWeight = fontweight,
        color = color,
        modifier = modifier,
        fontFamily = poppins
    )
}

@Composable
fun SubTitle(text: String, fontweight: FontWeight, color: Color, modifier: Modifier = Modifier) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = fontweight,
        color = color,
        modifier = modifier,
        fontFamily = poppins
    )
}

@Composable
fun PersonalDataText(text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = text1,
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 15.dp),
            fontFamily = poppins
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.padding(top = 5.dp),
            fontFamily = poppins
        )
    }
}

@Composable
fun Expertise(drawableResId: Int, text: String, modifier: Modifier = Modifier) {
    Row(Modifier.padding(top = 10.dp)) {
        SmolIcon(
            drawableResId, Modifier
                .size(50.dp)
        )
        SubTitle(text, FontWeight.Normal, Color.Black, modifier)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileView() {
    Week2Lab_0706012210011Theme {
        Profile("Android")
    }
}

private val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)