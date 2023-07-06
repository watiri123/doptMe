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
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme
import net.simplifiedcoding.ui.theme.spacing

@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .background(color = Color(0XFF212121))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        item {
            Column() {
                Text(text = "Location", color = Color.White)
                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.location),
                        contentDescription = "LOCATION",
                        modifier = Modifier
                            .size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Nairobi,Kenya", color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(
                modifier = Modifier
                    .background(color = Color.Gray)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                LazyRow {

                    item {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.message),
                                contentDescription = "A cat",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(35.dp)
                                    .padding(5.dp)
                            )
                            Text(text = "Forum", color = Color.Black)

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }

                    item {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.cat),
                                contentDescription = "A cat",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(35.dp)
                                    .padding(5.dp)
                            )
                            Text(text = "Food", color = Color.Black)

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }


                    item {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.paw),
                                contentDescription = "A cat",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(35.dp)
                                    .padding(5.dp)
                            )
                            Text(text = "Adopt", color = Color.Black)

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }

                    item {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.donation),
                                contentDescription = "A cat",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(35.dp)
                                    .padding(5.dp)
                            )
                            Text(text = "Donation", color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                    item {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.user),
                                contentDescription = "A cat",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(35.dp)
                                    .padding(5.dp)
                            )
                            Text(text = "Profile",
                                color = Color.Black,
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_PROFILE) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    }
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }

            }
            Spacer(modifier = Modifier.height(10.dp))



            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Button(
                    onClick = {},

                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    shape = RectangleShape,

                    )
                {
                    Image(
                        painter = painterResource(id = R.drawable.male),
                        contentDescription = "male",
                        modifier = Modifier
                            .size(35.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        "Male", color = Color.White,
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    onClick = {},

                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color.DarkGray),
                    shape = RectangleShape,

                    )
                {
                    Image(
                        painter = painterResource(id = R.drawable.female),
                        contentDescription = "male",
                        modifier = Modifier
                            .size(35.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        "Female", color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }

        item{
            Row()
            {
                val paddingModifier = Modifier
                    .padding(10.dp)
                    .width(240.dp)
                Card(shape = RoundedCornerShape(10.dp),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant)

                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.cat3),
                            contentDescription = "a cat",
                            modifier = Modifier
                                .height(200.dp)
                                .width(130.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column() {
                            Text(text = "Phoenix", modifier = paddingModifier,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "Tabby Cat",
                                fontSize = 18.sp,
                            )
                            Text(text = "3 years old",
                                fontSize = 15.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row() {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = "location",
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Nairobi, Kenya")
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {},
                                modifier = Modifier,
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(Color.Black),
                            )
                            {
                                Text(
                                    "Details", color = Color.White,
                                    fontSize = 17.sp,
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_DETAIL) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                )
                            }
                        }

                    }

                }
            }
            Spacer(modifier = Modifier.height(10.dp))


        }

        item{
            Row(

            ) {
                val paddingModifier = Modifier
                    .padding(10.dp)
                    .width(240.dp)
                Card(shape = RoundedCornerShape(10.dp),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant)

                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.cat2),
                            contentDescription = "a cat",
                            modifier = Modifier
                                .height(200.dp)
                                .width(130.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column() {
                            Text(text = "Flexy", modifier = paddingModifier,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "Ocicat",
                                fontSize = 18.sp,
                            )
                            Text(text = "4 years old",
                                fontSize = 15.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row() {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = "location",
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Nairobi, Kenya")
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {},

                                modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RectangleShape,

                                )
                            {

                                Text(
                                    "Details", color = Color.White,
                                    fontSize = 17.sp,
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_PAGE) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                )
                            }
                        }

                    }

                }
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
        item{
            Row()
            {
                val paddingModifier = Modifier
                    .padding(10.dp)
                    .width(240.dp)
                Card(shape = RoundedCornerShape(10.dp),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant)

                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.cat2),
                            contentDescription = "a cat",
                            modifier = Modifier
                                .height(200.dp)
                                .width(130.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column() {
                            Text(text = "Lexi", modifier = paddingModifier,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "American Wirehair",
                                fontSize = 18.sp,
                            )
                            Text(text = "3 years old",
                                fontSize = 15.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row() {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = "location",
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Nairobi, Kenya")
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {navController.navigate(ROUTE_DETAIL) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                         }},
                                modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RectangleShape,

                                )
                            {

                                Text(
                                    "Details", color = Color.White,
                                    fontSize = 15.sp
                                )
                            }
                        }

                    }

                }


            }

            Spacer(modifier = Modifier.height(10.dp))
        }


        item{
            Row()
            {
                val paddingModifier = Modifier
                    .padding(10.dp)
                    .width(240.dp)
                Card(shape = RoundedCornerShape(10.dp),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant)

                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.cat3),
                            contentDescription = "a cat",
                            modifier = Modifier
                                .height(200.dp)
                                .width(135.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column() {
                            Text(text = "Maxi", modifier = paddingModifier,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "American Wirehair",
                                fontSize = 18.sp,
                            )
                            Text(text = "2 years old",
                                fontSize = 15.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row() {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = "location",
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Nairobi, Kenya")
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {navController.navigate(ROUTE_DETAIL) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }},
                                modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RectangleShape,

                                )
                            {

                                Text(
                                    "Details", color = Color.White,
                                    fontSize = 15.sp
                                )
                            }
                        }

                    }

                }


            }
            Spacer(modifier = Modifier.height(10.dp))
        }


        item{
            Row()
            {
                val paddingModifier = Modifier
                    .padding(10.dp)
                    .width(240.dp)
                Card(shape = RoundedCornerShape(10.dp),

                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,

                        ),

                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant)

                ) {
                    Row() {
                        Image(
                            painter = painterResource(id = R.drawable.cat4),
                            contentDescription = "a cat",
                            modifier = Modifier
                                .height(200.dp)
                                .width(135.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Column() {
                            Text(text = "Fury", modifier = paddingModifier,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = "American Wirehair",
                                fontSize = 18.sp,
                            )
                            Text(text = "3 years old",
                                fontSize = 15.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row() {
                                Image(
                                    painter = painterResource(id = R.drawable.location),
                                    contentDescription = "location",
                                    modifier = Modifier
                                        .size(25.dp)
                                )
                                Spacer(modifier = Modifier.width(5.dp))
                                Text(text = "Nairobi, Kenya")
                            }
                            Spacer(modifier = Modifier.height(5.dp))
                            Button(
                                onClick = {},
                                modifier = Modifier,
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                shape = RectangleShape,

                                )
                            {

                                Text(
                                    "Details", color = Color.White,
                                    fontSize = 15.sp
                                )
                            }
                        }

                    }

                }


            }

        }


    }


}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AppTheme {
        HomeScreen(null, rememberNavController())
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreviewDark() {
    AppTheme {
        HomeScreen(null, rememberNavController())
    }
}
