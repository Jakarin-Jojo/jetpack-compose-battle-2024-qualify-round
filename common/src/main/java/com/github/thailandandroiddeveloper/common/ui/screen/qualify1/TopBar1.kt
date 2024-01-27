package com.github.thailandandroiddeveloper.common.ui.screen.qualify1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
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
fun TopBar1() {
    CenterAlignedTopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        modifier = Modifier
            .height(64.dp)
            .fillMaxWidth()
        ,
        title = { },
        navigationIcon = {
            Image(
                painter = painterResource(R.drawable.ic_qualify_1_menu),
                contentDescription = "Menu Image qualify 1",
                modifier = Modifier.fillMaxHeight(),
            )
        },
        actions = {
            Image(
                painter = painterResource(R.drawable.ic_qualify_1_profile),
                contentDescription = "Profile Image qualify 1",
                modifier = Modifier.fillMaxHeight(),
            )
        }
    )
}