package com.maxbay.productsTestEffectiveMobile.presentation.ui.widget

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.maxbay.productsTestEffectiveMobile.ui.ProductsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomMenuItem(
    iconId: Int,
    titleId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column {
        Box(
            modifier = modifier.clickable(onClick = onClick),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = stringResource(id = titleId),
                tint = Color.Unspecified
            )
        }

        Text(text = stringResource(id = titleId))
    }
}

@Composable
@Preview(showBackground = true)
fun NavDestinationItemPreview() {
    ProductsTheme {
        BottomMenuItem(
            iconId = android.R.drawable.sym_def_app_icon,
            titleId = android.R.string.dialog_alert_title,
            onClick = {}
        )
    }
}