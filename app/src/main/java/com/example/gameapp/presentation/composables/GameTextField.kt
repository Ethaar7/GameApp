package com.example.gameapp.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameapp.R
import com.example.gameapp.ui.theme.Typography
import com.example.gamegate.theme.text37
import com.example.gamegate.theme.text87


//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun GameTextField(
//    modifier: Modifier = Modifier,
//    hint: String,
//    iconPainter: Painter,
//    onValueChange: (String) -> Unit,
//    text: String = "",
//    errorMessage: String = "",
//    oneLineOnly: Boolean = false,
//    isPassword: VisualTransformation = VisualTransformation.None,
//    isError: Boolean = errorMessage.isNotEmpty(),
//    color: Color,
//    keyboardOptions: KeyboardOptions =  KeyboardOptions.Default.copy(
//        imeAction = ImeAction.Search)
//    ) {
//    Column {
//
//        OutlinedTextField(
//            singleLine = oneLineOnly,
//            modifier = modifier
//                .fillMaxWidth()
//                .padding(start = 16.dp)
//                .height(48.dp),
//            value = text,
//            onValueChange = onValueChange,
//            label = {
//                Text(
//                    text = hint,
//                    color = if (isError) error else text37,
//                    style = Typography.bodyMedium,
//                )
//            },
//            visualTransformation = isPassword,
//            keyboardOptions=keyboardOptions,
//            shape = 16.dp,
//            maxLines = 1,
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedSupportingTextColor = if (isError) error else text37,
//                focusedContainerColor = Color.Transparent,
//                disabledContainerColor = (MaterialTheme.colorScheme.onTertiary),
//                focusedBorderColor = if (isError) error else text37,
//                unfocusedBorderColor = if (isError) error else text37,
//            ),
//            trailingIcon = {
//                if (isError) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_error_password),
//                        contentDescription = stringResource(R.string.copy_button),
//                        tint = error
//                    )
//                }
//            },
//            leadingIcon = {
//                Icon(
//                    painter = iconPainter,
//                    contentDescription = stringResource(R.string.copy_button),
//                    tint = if (isError) error else color
//                )
//            },
//            isError = isError,
//        )
//        if (isError) {
//            Text(
//                text = errorMessage,
//                color = error,
//                style = Typography.displaySmall,
//                modifier = Modifier.padding(
//                    start = 16.dp,
//                    top = 0.dp
//                )
//            )
//        }
//    }
//}
//
//
//@Preview(name = "phone", device = Devices.PHONE, showSystemUi = true)
//@Composable
//fun TextFieldPreview() {
//    GameTextField(
//        hint = "Email",
//        iconPainter = painterResource(id = R.drawable.ic_email),
//        isError = true,
//        errorMessage = stringResource(R.string.that_s_not_a_valid_email),
//        onValueChange = {},
//        color = text87
//    )
//}
//
//@Preview(name = "Tablet", device = Devices.TABLET, showSystemUi = true)
//@Composable
//fun TextFieldTabletPreview() {
//    GameTextField(
//        hint = "Email",
//        iconPainter = painterResource(id = R.drawable.ic_email),
//        isError = true,
//        errorMessage = stringResource(R.string.that_s_not_a_valid_email),
//        onValueChange = {},
//        color = text87
//    )
//}