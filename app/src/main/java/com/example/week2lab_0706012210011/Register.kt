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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2lab_0706012210011.ui.theme.Week2Lab_0706012210011Theme

class Register : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Lab_0706012210011Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Register("Android")
                }
            }
        }
    }
}

@Composable
fun Register(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFFFFC0CB),
            )
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
            contentDescription = "Arrow Back",
            modifier = Modifier
                .padding(25.dp)
                .size(30.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.registerlogo),
                contentDescription = "Arrow Back",
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp),
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp)
                .background(
                    Color(0xFFF0F0F0),
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                )
        ) {
            Text(
                text = "Create New Account",
                fontSize = 24.sp,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 15.dp),
                fontFamily = poppins,
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray,
                textAlign = TextAlign.Center
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 75.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row {
                        SmallIcons(R.drawable.facebook_icon)
                        SmallIcons(R.drawable.x_icon)
                        SmallIcons(R.drawable.google_icon)
                    }
                    Text(
                        text = "or use your email account",
                        fontSize = 16.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(vertical = 5.dp),
                        fontFamily = poppins
                    )

                    Column {
                        LabelFill("Name", "Ex: Jane Doe")
                        LabelFill("Email", "Ex: janedoe@example.com")
                        Text(
                            text = "Password",
                            color = Color.Black,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(top = 15.dp, bottom = 5.dp),
                            fontFamily = poppins
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .border(
                                    width = 1.dp,
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(15.dp)
                                )
                                .padding(15.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Enter Password",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Light,
                                color = Color.LightGray,
                                fontFamily = poppins,
                            )
                            Image(
                                painter = painterResource(R.drawable.baseline_visibility_off_24),
                                contentDescription = "Hidden",
                                modifier = Modifier
                                    .padding(top = 3.dp)
                                    .size(20.dp),
                            )
                        }

                    }

                    Text(
                        text = "Register",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 30.dp)
                            .background(
                                color = Color(0xFFE65B5E),
                                shape = RoundedCornerShape(15.dp)
                            )
                            .padding(vertical = 10.dp, horizontal = 50.dp),
                        fontFamily = poppins,
                        color = Color.White
                    )
                    Text(
                        text = "Already have an account?",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 15.dp),
                        fontFamily = poppins
                    )
                    Text(
                        text = "Login Here",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFE65B5E),
                        modifier = Modifier.padding(top = 5.dp, bottom = 15.dp),
                        fontFamily = poppins
                    )
                }
            }
        }
    }
}

@Composable
fun SmallIcons(drawableResId: Int) {
    Image(
        painter = painterResource(id = drawableResId),
        contentDescription = "Icons Cute",
        modifier = Modifier
            .padding(10.dp)
            .size(40.dp),
    )
}

@Composable
fun LabelFill(label: String, value: String) {

    Text(
        text = label,
        fontSize = 16.sp,
        color = Color.Black,
        modifier = Modifier.padding(top = 15.dp, bottom = 5.dp),
        fontFamily = poppins
    )

    Text(
        text = value,
        fontSize = 16.sp,
        fontWeight = FontWeight.Light,
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(15.dp)
            )
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(15.dp)
            )
            .padding(15.dp),
        fontFamily = poppins,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterView() {
    Week2Lab_0706012210011Theme {
        Register("Android")
    }
}

private val poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
)