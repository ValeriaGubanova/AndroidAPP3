package com.example.app3


import android.content.ClipData
import android.media.RouteListingPreference.Item
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.app3.ui.theme.APP3Theme
import com.example.app3.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APP3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@RequiresApi(34)
@Composable
fun Greeting( modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
      item {
          Image(
              painter = painterResource(id = R.drawable.img), contentDescription = null,
              modifier = modifier
                  .fillMaxWidth(), contentScale = ContentScale.FillWidth
          )
      }
        item{Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA) " +
                    "game which has two teams of five players compete to collectively destroy a large " +
                    "structure defended by the opposing team known as the \"Ancient\", whilst defending their own.!",
            modifier = modifier
        )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APP3Theme {
        Greeting()
    }
}