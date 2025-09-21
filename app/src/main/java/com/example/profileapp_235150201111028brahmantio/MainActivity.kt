package com.example.profileapp_235150201111028brahmantio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.example.profileapp_235150201111028brahmantio.ui.theme.ProfileApp_235150201111028BrahmantioTheme
import androidx.compose.foundation.layout.Arrangement

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileApp_235150201111028BrahmantioTheme {
                ProfileScreen(
                    nama = "Brahmantio Jati Pambudi",
                    nim  = "235150201111028",
                    deskripsi = "Mahasiswa Teknik Informatika"
                )
            }
        }
    }
}

@Composable
fun ProfileScreen(nama: String, nim: String, deskripsi: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profil),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )

            Spacer(Modifier.height(12.dp))

            Text(text = "Nama: $nama", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "NIM: $nim")
            Text(text = deskripsi)

            Spacer(Modifier.height(16.dp))

            FollowButton()
        }
    }
}

@Composable
fun FollowButton() {
    val isFollowed = remember { mutableStateOf(false) }
    Button(onClick = { isFollowed.value = !isFollowed.value }) {
        Text(if (isFollowed.value) "Unfollow" else "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    ProfileApp_235150201111028BrahmantioTheme {
        ProfileScreen(
            nama = "Brahmantio Jati Pambudi",
            nim  = "235150201111028",
            deskripsi = "Mahasiswa Teknik Informatika"
        )
    }
}
