package com.example.gameapp.presentation.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gameapp.ui.theme.Typography
import com.example.gamegate.theme.text37

@Composable
fun ItemLabel(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconPainter: Painter = painterResource(id = R.drawable.alt_arrow_right),
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceBetween,
    ) {
        Text(
            text = label,
            style = Typography.titleLarge,
        )

        Row(modifier = Modifier.clickable(onClick = { onClick() })) {
            Text(text = stringResource(R.string.more), style = Typography.bodySmall)
            Icon(
                painter = iconPainter,
                contentDescription = null,
                tint = text37,
                modifier = Modifier
                    .size(16.dp),
            )

        }

    }
}

@Preview
@Composable
fun ItemLabelPreview() {
    ItemLabel(label = "Label", onClick = {})
}