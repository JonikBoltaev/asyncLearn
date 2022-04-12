package ru.jonik.asynclearn.views

interface UiActions {

    fun toast(message: String)
//
    fun getString(messageRes: Int, vararg args: Any): String

}