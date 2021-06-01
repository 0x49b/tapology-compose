package fhnw.emoba.tapology

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import fhnw.emoba.EmobaApp
import fhnw.emoba.tapology.model.TapologyModel
import fhnw.emoba.tapology.ui.AppUI


object TypologyApp : EmobaApp {

    override fun initialize(activity: ComponentActivity) {
    }

    @Composable
    override fun CreateUI() {
        AppUI(TapologyModel)
    }

}

