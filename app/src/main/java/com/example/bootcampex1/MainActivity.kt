 package com.example.bootcampex1

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bootcampex1.ui.theme.BootcampEx1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BootcampEx1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

 @Preview(showBackground = true)
@Composable
fun CreateBizCard(){
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        color = Color(0xFFF9F9F9),
        ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(16.dp)
            ,
            shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                createProfileImage()
                Divider(
                    thickness = 1.dp,
                    color = Color.LightGray)
                createInfoColumn()
                Button(
                    onClick = {

                    }
                ) {
                    Text(text = "Portfolio",
                        style = MaterialTheme.typography.bodyMedium)
                    
                }
            }

        }
    }
}

 @Composable
 private fun createInfoColumn() {
     Column(
         modifier = Modifier
             .padding(8.dp)
     ) {
         Text(
             text = "Dani Fernández",
             style = MaterialTheme.typography.headlineMedium,
             color = MaterialTheme.colorScheme.onSurface
         )
         Text(
             text = "Product Designer",
             style = MaterialTheme.typography.bodyMedium,
             color = MaterialTheme.colorScheme.onSurface
         )
         Text(
             text = "danifdezalonso@gmail.com",
             style = MaterialTheme.typography.bodyMedium,
             color = MaterialTheme.colorScheme.onSurface
         )
     }
 }

 @Composable
 private fun createProfileImage() {
     Surface(
         modifier = Modifier
             .padding(24.dp)
             .size(150.dp),
         shape = CircleShape,
         border = BorderStroke(0.5.dp, Color.LightGray),
     ) {
         Image(
             painter = painterResource(id = R.drawable.profile_image),
             contentDescription = "Foto de perfil"
         )
     }
 }