package com.example.app3


import android.content.ClipData
import android.media.RouteListingPreference.Item
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SliderColors
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app3.ui.theme.APP3Theme
import com.example.app3.R
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import com.example.app3.ui.theme.Background
import com.example.app3.ui.theme.TextColor
import com.example.app3.ui.theme.Yellow



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APP3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Background
                ) {
                    Screen("Android")
                }
            }
        }
    }
}


@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
      item {
          StartImage(modifier)
      }
        item {
           LogoGame()
        }
        item {
            DescriptionGame(modifier)
        }
        item {
            SliderVideo()
            }
        item {
            DescriptionComment()
        }
        item {
            Comment()
        }
            item {
                ButtonInstall()
            }
    }

}

@Composable
fun StartImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img), contentDescription = null,
        modifier = modifier
            .fillMaxWidth(), contentScale = ContentScale.FillWidth
    )
}
@Composable
fun LogoGame() {
    Box(
        modifier = Modifier
            .offset(15.dp, (-50).dp)
            .size(150.dp)
            .clip(RoundedCornerShape(13.54.dp)),
        contentAlignment = Alignment.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.img_2), contentDescription = null,
            modifier = Modifier
                .size(150.dp, 150.dp)
                .align(Alignment.Center)
        )
        Image(
            painter = painterResource(id = R.drawable.img_1), contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .offset((-6).dp, (-12).dp),
            alignment = Alignment.Center
        )
    }
}
@Composable
fun DescriptionGame(modifier: Modifier = Modifier) {
    Text(
        color = TextColor,
        text = "Dota 2 is a multiplayer online battle arena (MOBA) " +
                "game which has two teams of five players compete to collectively destroy a large " +
                "structure defended by the opposing team known as the \"Ancient\", whilst defending their own.!",
        modifier = modifier
            .size(330.dp)
            .offset((40).dp, (-10).dp)
    )
}
@Composable
fun DescriptionComment() {
    Text(
    text = "Review & Ratings",
    color = TextColor,
    modifier = Modifier
        .fillMaxSize()
        .offset(40.dp, (-100).dp)
)}
@Composable
fun SliderVideo() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .offset(40.dp, (-130).dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.screen1),
            contentDescription = null,
            modifier = Modifier
                .size(240.dp, 135.dp)
                .clip(RoundedCornerShape(13.54.dp))
        )
        Image(
            painter = painterResource(id = R.drawable.screen2),
            contentDescription = null,
            modifier = Modifier
                .size(140.dp, 131.dp)
                .clip(RoundedCornerShape(35.64.dp))

        )
    }
}

@Composable
fun Comment() {
    Row( modifier = Modifier
        .fillMaxWidth()
        .offset(40.dp, (-80).dp)) {
        Image(
            painter = painterResource(id = R.drawable.person1),
            contentDescription = null,
            modifier = Modifier
                .size(36.dp)
                .clip(RoundedCornerShape(35.64.dp))
        )
        Column(
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Text(
                text = "Auguste Conte",
                color = TextColor,
                modifier = Modifier.offset(10.dp, 0.dp)
            )
            Text(
                text = "February 14, 2019",
                color = TextColor,
                modifier = Modifier.offset(10.dp, 0.dp)
            )
        }
    }
        Text(
            text = "Once you start to learn its secrets, there’s a wild and exciting variety " +
                    "of play here that’s unmatched, even by its peers." ,
            color = TextColor,
            modifier = Modifier.offset(40.dp, (-70).dp)
                .size(330.dp, 100.dp)
        )

}
@Composable
fun ButtonInstall() {
    Box(
        modifier = Modifier
            .offset(40.dp, (-50).dp)
            .width(327.dp)
            .height(64.dp)
            .clip(RoundedCornerShape(13.54.dp))
            .background(Yellow)
    ) {
        Text(
            text = "Install",
            color = Background,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .offset(0.dp, 20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    APP3Theme {
        Screen("Android")
    }
}