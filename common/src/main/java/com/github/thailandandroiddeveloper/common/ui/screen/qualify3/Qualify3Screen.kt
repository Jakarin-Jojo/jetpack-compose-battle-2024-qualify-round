package com.github.thailandandroiddeveloper.common.ui.screen.qualify3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.thailandandroiddeveloper.common.R
import com.github.thailandandroiddeveloper.common.ui.preview.Pixel7
import com.github.thailandandroiddeveloper.common.ui.theme.AppTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Qualify3Screen() {
    Scaffold(
        topBar = {
            TopBar3()
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(
                    top = 16.dp,
                    start = 16.dp,
                )
        )
        {
            val pagerState = rememberPagerState(pageCount = { 3 })
            HorizontalPager(
                state = pagerState,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_photo_1),
                    contentDescription = "Image content",
                    modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = MaterialTheme.colorScheme.primary,
                            shape = MaterialTheme.shapes.large
                        )
                        .clip(shape = MaterialTheme.shapes.large)
                        .width(160.dp)
                        .height(320.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_photo_2),
                    contentDescription = "",
                    modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            shape = MaterialTheme.shapes.large
                        )
                        .clip(shape = MaterialTheme.shapes.large)
                        .width(160.dp)
                        .height(320.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.img_qualify_3_photo_3),
                    contentDescription = "",
                    modifier = Modifier
                        .border(
                            width = 2.dp,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            shape = MaterialTheme.shapes.large
                        )
                        .clip(shape = MaterialTheme.shapes.large)
                        .width(160.dp)
                        .height(320.dp)
                )
            }
            Row(
                modifier = Modifier.padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                OutlinedButton(
                    onClick = { },
                    border = BorderStroke(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.primary,
                    ),
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.size( height = 32.dp, width = 68.dp ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Tag 1",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.primary,
                    )
                }
                OutlinedButton(
                    onClick = {},
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.size( height = 32.dp, width = 68.dp ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Tag 2",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.outline,
                    )
                }
                OutlinedButton(
                    onClick = {},
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.size( height = 32.dp, width = 68.dp ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Tag 3",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
                OutlinedButton(
                    onClick = {},
                    shape = MaterialTheme.shapes.small,
                    modifier = Modifier.size( height = 32.dp, width = 68.dp ),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Tag 4",
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.outline
                    )
                }

            }
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(end = 16.dp)
            ) {
                CardBackground(
                    title = "Lorem Ipsum",
                    description = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo consectetur. Sed congue blandit nibh.",
                    imageResource = painterResource(id = R.drawable.img_qualify_3_sender)
                )
                CardBackground(
                    title = "Lorem Ipsum",
                    description = "Morbi sed sagittis justo, at pulvinar ipsum. Praesent massa metus, interdum at suscipit a, interdum vel orci. Pellentesque in sapien. Integer faucibus mauris ac luctus aliquam accumsan.",
                    imageResource = painterResource(id = R.drawable.img_qualify_3_sender)
                )
                CardBackground(
                    title = "Lorem Ipsum",
                    description = "Duis dignissim pulvinar lectus imperdiet tempus. Curabitur fringilla commodo.",
                    imageResource = painterResource(id = R.drawable.img_qualify_3_sender)
                )
                CardBackground(
                    title = "Lorem Ipsum",
                    description = "Ut hendrerit neque nec accumsan hendrerit. Fusce lobortis rhoncus erat, a blandit nibh molestie vel. Cras commodo ligula ex, vitae venenatis lacus facilisis eget.",
                    imageResource = painterResource(id = R.drawable.img_qualify_3_sender)
                )
            }
        }
    }
}

// region Read-only because we use this to process your score.
@Composable
@Preview(group = Pixel7.name, device = Pixel7.spec, showBackground = true)
fun Qualify3ScreenPreview() = AppTheme {
    Qualify3Screen()
}
// endregion