package net.simplifiedcoding.ui.home

import android.content.Intent
import net.simplifiedcoding.ui.auth.AuthViewModel


import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.data.Resource
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_SIGNUP
import net.simplifiedcoding.navigation.ROUTE_TEST
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun testScreen(viewModel: AuthViewModel?, navController: NavController) {
    var text by remember { mutableStateOf ( TextFieldValue(""))}

    val home = LocalContext.current


    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ){


        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {



            Image(painter = painterResource(id = R.drawable.screen),
                contentDescription ="background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )


            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text( "")


                Text("Make A New Friend", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 25.sp)
                Spacer(modifier = Modifier
                    .height(10.dp)
                )
                Text("Too Many Cute Pets Are Waiting For You", color = Color.Black, fontSize = 15.sp )

                Spacer(modifier = Modifier.height(50.dp))



                Button(onClick = {},

                    colors = ButtonDefaults.buttonColors(Color(0XFF9575CD)),
                    shape = RectangleShape,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)

                )
                {
                    Image(painter = painterResource(id = R.drawable.right), contentDescription = "shopping",
                        modifier = Modifier
                            .size(25.dp)

                    )
                    Spacer(modifier = Modifier
                        .width(10.dp))
                    Text(
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ROUTE_SIGNUP) {
                                    popUpTo(ROUTE_TEST) { inclusive = true }
                                }
                            },
                        text = "Get Started", color = Color.White,
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.SansSerif
                    )


                }



                Spacer(modifier = Modifier.height(40.dp))
























            }


        }


    }









}

//@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
//@Composable
//fun LoginScreenPreviewLight() {
//    AppTheme {
//        LoginScreen(null, rememberNavController())
//    }
//}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreviewDark() {
    AppTheme {
        testScreen(null, rememberNavController())
    }
}
