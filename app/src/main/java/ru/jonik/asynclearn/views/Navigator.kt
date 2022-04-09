package ru.jonik.asynclearn.views

/**
 * Navigation for your application
 */
interface Navigator {
    fun launch(screen: BaseScreen)
    fun goBack(result: Any? = null)

}