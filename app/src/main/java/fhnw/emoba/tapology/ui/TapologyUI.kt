package fhnw.emoba.tapology.ui


import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import fhnw.emoba.tapology.model.TapologyModel


@Composable
fun AppUI(model: TapologyModel) {
    with(model) {
        Text(text = title, style = TextStyle(fontSize = 28.sp))
    }
}
