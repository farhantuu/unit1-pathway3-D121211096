package com.example.tugasmobile

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasmobile.ui.theme.TugasMobileTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            greetingCard()

        }
        }
    }

@Composable
fun greetingCard(){
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box {
            Image(
                modifier = Modifier
                    .size(260.dp),
                painter = painterResource(id = R.drawable.han),
                contentDescription = "Profile Picture",
                alignment = Alignment.Center
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        Box {
            Text(
                text = "Farhan Arya Dira",
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        Text(
            text = "D121211096",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(30.dp))


    Column{
            Row {
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = "Contact Person",
                    modifier = Modifier.size(19.dp)
                )
                BasicText(
                    text = " 082347xxxxxxx",
                )
            }
        }

            Row {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = "Email",
                        modifier = Modifier
                            .size(19.dp)
                    )
                    Text(
                        text = " farhanad@example.com",
                        textAlign = TextAlign.Justify
                    )
            }
        }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    greetingCard()
}