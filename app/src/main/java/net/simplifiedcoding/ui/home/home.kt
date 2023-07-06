package net.simplifiedcoding.ui.home

import android.content.ClipData
import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_DETAIL
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@Composable
fun Home(viewModel: AuthViewModel?, navController: NavHostController) {


    LazyColumn(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxWidth()
            .fillMaxSize(),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
       item {


               Column(
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.cat3),
                       contentDescription = "A cat",
                       contentScale = ContentScale.Crop,
                       modifier = Modifier
                           .size(500.dp)
                           .fillMaxWidth()
                           .width(300.dp)

                   )

               }
               Spacer(modifier = Modifier.height(10.dp))
           }

           item {
               val paddingModifier = Modifier
                   .padding(10.dp)
                   .width(410.dp)
                   .height(300.dp)
               Card(shape = RoundedCornerShape(10.dp),
                modifier = paddingModifier,
                   elevation = CardDefaults.cardElevation(
                       defaultElevation = 10.dp,
                       ),
                   colors = CardDefaults.cardColors(
                       containerColor = Color(0XFF212121)
                   )
                       )
               {
                   Column(
                       horizontalAlignment = Alignment.CenterHorizontally
                   )
                   {
                       Row(
                           horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.Top
                       ) {
                           Image(
                               painter = painterResource(id = R.drawable.person1),
                               contentDescription = "profile",
                               modifier = Modifier
                                   .size(80.dp)
                           )
                           Column() {
                               Text(text = "Tammy",
                                   fontSize = 20.sp,
                                   color = Color.White,
                                   textAlign = TextAlign.Right
                               )
                               Spacer(modifier = Modifier.height(5.dp))

                               Text(text = "Description:",
                                   fontSize = 18.sp,
                                   color = Color.White,
                                   textAlign = TextAlign.Right
                               )
                           }



                           Text(text = "17th April 2023", color = Color.White)
                       }


                        Text(text = " I can't take my cat with me." +

                               " If you are a good person and you are good with cats, " +
                               "please contact me.", color = Color.White, fontSize = 18.sp)

                   }

                   Row(
                       horizontalArrangement = Arrangement.Center
                   ) {
                       Button(
                           onClick = {},
                           modifier = Modifier
                           .padding(30.dp),
                           colors = ButtonDefaults.buttonColors(Color.White),
                           shape = RectangleShape,

                           )
                       {
                           Text(
                               "Adopt", color = Color.Black,
                               fontSize = 18.sp,
                               modifier = Modifier
                                   .clickable {
                                       navController.navigate(ROUTE_HOME) {
                                           popUpTo(ROUTE_DETAIL) { inclusive = true }
                                       }
                                   }
                           )
                       }
                   }


               }


               Spacer(modifier = Modifier.width(10.dp))
           }
       } }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomePreviewLight() {
    AppTheme {
        Home(null, rememberNavController())
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomePreviewDark() {
    AppTheme {
        Home(null, rememberNavController())
    }
}