package com.example.letscompose

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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.letscompose.ui.theme.LetsComposeTheme

/**
 * @DrStart:    This app shows how to use different composables to build your UI. You can
 *            use the composables that are provided by Compose UI. You can also create your
 *            own composables. The user enters a name in the text field. The name is displayed
 *            in the center of the screen. The user can also add the name to a list of names.
 *            The list of names is displayed below the text field.
 *            The app also shows how to use Material3 Theme and Surface with Compose. This is the
 *            recommended way to use Material3 in Compose.
 * */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LetsComposeTheme {
                // declare a state variable called name and set it to ""
                var name by remember {
                    mutableStateOf("")
                }
//                declare a state variable list called names
                var names by remember {
                    mutableStateOf(listOf<String>(""))
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(16.dp)
                ) {
                    /**
                     * @DrStart:      Design a row with a text field and a button. The
                     *              text field is used to enter the name. The button is used
                     *             to add the name to the list.
                     * */
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name, onValueChange = { text ->
                                name = text
                            },
                            modifier = Modifier.weight(1f),
                            label = {
                                Text(text = "Enter your name")
                            })
                        Spacer(modifier = Modifier.padding(16.dp))
                        Button(onClick = {
                            if (name.isNotBlank()) {
                                names += name
                                name = ""
                            }
                        }) {
                            Text(text = "Add")
                        }
                    }
                    /**
                     * @DrStart:    add composable to show list of names added.
                     * */

                    NameList(names = names)
                }

                /**
                 * @DrStart:      An example of using Material3 Theme and Surface with Compose. This is the
                 *               recommended way to use Material3 in Compose. Increment the count by
                 *               clicking the button. The count is displayed in the center of the screen.
                 *               The button is aligned to the bottom of the screen. The button is
                 *               colored using the primary color from the Material3 theme.
                 * */
//                var count by remember {
//                    mutableStateOf(0)
//                }
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize(),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(
//                        text = count.toString(),
//                        fontSize = 30.sp,
//                    )
//                    Button(onClick = {
//                        count++
//                    }) {
//                        Text(text = "Click Me")
//                    }
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    /**
     * @DrStart:    Different composables that you can use to build your UI. You can use
     *            these composables to build your UI. You can also create your own. Uncomment to customize
     *            your UI based on your needs.
     * */
//
//    LazyRow(
//        modifier = Modifier
//            .fillMaxSize()
//    )
//
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        items(20) { i ->
//            Icon(
//                imageVector = Icons.Default.Build,
//                contentDescription = null,
//                modifier = Modifier
//                    .padding(16.dp)
//            )
//        }
//    }

//    Column() {
//        if (name.isNotEmpty()) {
//            Text(
//                text = "Hello $name!",
//                fontSize = 24.sp,
//                modifier = modifier
//                    .padding(16.dp)
//                    .fillMaxWidth()
//            )
//        }
//        Image(
//            painter = painterResource(id = R.drawable.loc1),
//            contentDescription = "Location Default",
//            modifier = Modifier
//                .size(100.dp)
//                .clip(CircleShape)
//                .border(1.dp, Color.Black, CircleShape)
//        )
//        for (i in 1..3) {
//            Icon(
//                imageVector = Icons.Default.Build,
//                contentDescription = null,
//                modifier = Modifier
//                    .align(Alignment.CenterHorizontally)
//                    .padding(16.dp)
//
//            )
//        }
//    }


//    Box(
//        modifier = modifier
//            .fillMaxSize()
//            .padding(30.dp)
//    )
//    {
//        Column(
//            horizontalAlignment = Alignment.Start,
//            verticalArrangement = Arrangement.Center,
//            modifier = modifier
//                .padding(16.dp)
//                .fillMaxWidth()
//        ) {
//            Text(
//                text = "Hello $name!",
//                fontSize = 24.sp
//
//            )
//            Text(
//                text = "Coding is fun...",
//                fontSize = 24.sp,
//            )
//        }
//        Column(
//            horizontalAlignment = Alignment.Start,
//            verticalArrangement = Arrangement.Center,
//            modifier = modifier
//                .padding(16.dp)
//                .fillMaxWidth()
//                .align(Alignment.BottomCenter)
//        ) {
//            Text(
//                text = "Hello $name!",
//                fontSize = 24.sp
//            )
//            Text(
//                text = "Coding is fun...",
//                fontSize = 24.sp,
//            )
//        }
//    }


}

/**
 * @DrStart:    reusable composables that you can use in different places in your app. You can
 *             pass parameters to the composable to customize it. For example, you can pass
 *             a list of names to the NameList composable to display a list of names. You can
 *             also pass a modifier to the composable to customize the layout of the composable.
 * */

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LetsComposeTheme {
        Greeting("Simba Start")
    }
}

@Composable
fun NameList(
    names: List<String>,
    modifier: Modifier = Modifier
) {
    LazyColumn {
        items(names) { currentName ->
            Text(
                text = currentName,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            Divider()
        }
    }
}
