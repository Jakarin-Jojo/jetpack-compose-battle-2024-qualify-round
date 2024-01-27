package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TopBar3() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        ),
        title = {
            Text(
                text = "John Doe",
                style = MaterialTheme.typography.titleLarge,
            )
        },
        navigationIcon = {
            Image(
                painter = painterResource(R.drawable.ic_qualify_3_back),
                contentDescription = "back Image qualify 3",

            )
        },
        actions = {
            Image(
                painter = painterResource(R.drawable.ic_qualify_3_copy),
                contentDescription = "copy Image qualify 1",
            )
            Image(
                painter = painterResource(R.drawable.ic_qualify_3_calendar),
                contentDescription = "calendar Image qualify 3",

            )
            Image(
                painter = painterResource(R.drawable.ic_qualify_3_menu),
                contentDescription = "menu Image qualify 3",

            )
        }
    )
}