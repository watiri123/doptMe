package net.simplifiedcoding.ui.home

import android.annotation.SuppressLint
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_DETAIL
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_PAGE
import net.simplifiedcoding.navigation.ROUTE_PROFILE
import net.simplifiedcoding.navigation.ROUTE_SIGNUP
import net.simplifiedcoding.ui.animate.homeAnimation
import net.simplifiedcoding.ui.animate.managerAnimation
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter") @OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profilescreen(viewModel: AuthViewModel?, navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .background(color = Color(0XFF212121))
            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    )
    {
        item {
          homeAnimation(height = 500)


            Column() {
//                Image(painter = painterResource(id = R.drawable.login), contentDescription = "profile",
//                    modifier = Modifier
//                        .size(250.dp)
//                        .padding(start = 70.dp)
//                )

                Text(
                    text = "Account Details",
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0XFF673AB7)),

                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .padding(start = 3.dp)
                )
                Spacer(modifier = Modifier.size(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Account icon",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(start = 2.dp)
                    )

                    Text(
                        text = viewModel?.currentUser?.displayName ?: "",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.weight(0.7f),
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Email icon",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(start = 2.dp)
                    )
                    Spacer(modifier = Modifier.size(20.dp))
                    Text(
                        text = viewModel?.currentUser?.email ?: "",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.weight(0.7f),
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.size(30.dp))

                // Add more details as needed

                Button(
                    onClick = {},

                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    shape = RectangleShape,

                    )
                {
                    Image(
                        painter = painterResource(id = R.drawable.logout),
                        contentDescription = "male",
                        modifier = Modifier
                            .size(35.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "LOG OUT",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF40C4FF),
                            modifier = Modifier
//                                .padding(start = 120.dp)
                                .clickable {
                                    navController.navigate(ROUTE_LOGIN) {
                                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                                    }
                                }
                    )

                }




            }


        }
    }
    }




    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @Composable
    fun ProfilescreenPreviewLight() {
        AppTheme {
            Profilescreen(null, rememberNavController())
        }
    }

    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
    @Composable
    fun ProfilescreennPreviewDark() {
        AppTheme {
            Profilescreen(null, rememberNavController())
        }
}


