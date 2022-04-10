package ru.jonik.asynclearn.views

interface Navigator {
    fun launch(screen: BaseScreen)
    fun goBack(result: Any? = null)

}