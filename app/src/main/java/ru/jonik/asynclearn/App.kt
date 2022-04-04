package ru.jonik.asynclearn

import android.app.Application
import ru.jonik.asynclearn.model.colors.InMemoryColorsRepository

class App : Application() {
    val models = listOf<Any>(
        InMemoryColorsRepository()
    )
}