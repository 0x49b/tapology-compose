package fhnw.emoba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable

interface EmobaApp {

    /**
     * Initialer Aufbau des App-Status.
     *
     * Bereitstellen aller initial notwendigen Daten (Daten werden normalerweise erst
     * geladen, wenn sie fuer die Anzeige benötigt werden).
     */
    fun initialize(activity: ComponentActivity)


    /**
     * Das gesamte UI der App.
     */
    @Composable
    fun CreateUI()


    /**
     * Wird aufgerufen sobald die App nicht mehr im Vordergrund sichtbar ist.
     */
    fun onStop(activity: ComponentActivity) {
        // Default: Nichts zu tun
    }
}