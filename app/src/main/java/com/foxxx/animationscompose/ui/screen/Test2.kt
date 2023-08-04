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
fun Test2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(
                state = rememberScrollState(),
            ),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
         var isIncreasedSize by remember() {
            mutableStateOf(true)
        }

        var isIncreasedShape by remember() {
            mutableStateOf(true)
        }

        var isIncreasedBorder by remember() {
            mutableStateOf(true)
        }

        var isIncreasedColor by remember() {
            mutableStateOf(true)
        }

        var isIncreasedVisibility by remember() {
            mutableStateOf(true)
        }

        AnimateButton(text = "Animate size") {
            isIncreasedSize = !isIncreasedSize
        }
        AnimateSizeContainer(
            text = "Animate size",
            isPressed = isIncreasedSize
        )

        AnimateButton(text = "Animate shape") {
            isIncreasedShape = !isIncreasedShape
        }
        AnimateShapeContainer(
            text = "Shape",
            isPressed = isIncreasedShape
        )

        AnimateButton(text = "Animate border") {
            isIncreasedBorder = !isIncreasedBorder
        }


        AnimateBorderContainer(
            text = "Border",
            isPressed = isIncreasedBorder
        )

        AnimateButton(text = "Animate color") {
            isIncreasedColor = !isIncreasedColor
        }
        AnimateColorContainer(
            text = "Color",
            isPressed = isIncreasedColor
        )

       AnimateButton(text = "Animate visibility") {
           isIncreasedVisibility = !isIncreasedVisibility
       }
        AnimateVisibilityContainer(
            text = "Visibility",
            isPressed = isIncreasedVisibility
        )
    }
}

@Composable
fun AnimateButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            onClick()
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White
        )
    ) {
        Text(text = text)
    }
}


@Composable
fun AnimateSizeContainer(
    text: String,
    isPressed: Boolean
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .size(size = if (isPressed) 200.dp else 100.dp)
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

@Composable
fun AnimateShapeContainer(
    text: String,
    isPressed: Boolean
) {
    Box(
        modifier = Modifier
            .clip(
                RoundedCornerShape(
                    size = if (isPressed) 8.dp else 100.dp
                )
            )
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

@Composable
fun AnimateBorderContainer(
    text: String,
    isPressed: Boolean
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .size(200.dp)
            .background(Color.Blue)
            .border(
                border = BorderStroke(
                    width = if (isPressed) 0.dp else 5.dp,
                    color = Color.White
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Composable
fun AnimateColorContainer(
    text: String,
    isPressed: Boolean
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .size(200.dp)
            .background(
                color = if (isPressed) Color.Blue else Color.Yellow
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Composable
fun AnimateVisibilityContainer(
    text: String,
    isPressed: Boolean
) {
    Box(
        modifier = Modifier
            .alpha(
                alpha = if (isPressed) 100f else 0f
            )
            .clip(RoundedCornerShape(8.dp))
            .size(200.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White
        )
    }
}