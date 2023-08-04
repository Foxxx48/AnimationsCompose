package com.foxxx.animationscompose.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Test() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(
                state = rememberScrollState(),
            ),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        var isIncreased by remember() {
            mutableStateOf(true)
        }
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                isIncreased = !isIncreased
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text(text = "Animate size")
        }
        AnimateContainer(
            text = "Animate size",
            modifier = Modifier
                .size(size = if (isIncreased) 200.dp else 100.dp)
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                      isIncreased = !isIncreased

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text(text = "Animate shape")
        }
        AnimateContainer(
            text = "Shape",
            modifier = Modifier
                .background(
                    color = if (isIncreased) Color.Blue else Color.Yellow,
                    shape = RoundedCornerShape(
                        percent = if (isIncreased) 0 else 100)
                )
        )


        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                      isIncreased = !isIncreased
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text(text = "Animate border")
        }
        AnimateContainer(
            text = "Border",
            modifier = Modifier
                .border(
                    border = BorderStroke(
                        width = if (isIncreased) 0.dp else 5.dp,
                        color = Color.White
                    )
                )
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                      isIncreased = !isIncreased
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text(text = "Animate color")
        }
        AnimateContainer(
            text = "Color",
            modifier = Modifier
                .background(
                    color = if (isIncreased) Color.Blue else Color.Yellow
                )
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                      isIncreased = !isIncreased
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        ) {
            Text(text = "Animate visibility")
        }
        AnimateContainer(
            text = "Visibility",
            modifier = Modifier
                .alpha(
                    alpha = if (isIncreased) 100f else 0f
                )
        )
    }
}


@Composable
fun AnimateContainer(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .size(200.dp)
            .background(
                color = Color.Blue
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}






