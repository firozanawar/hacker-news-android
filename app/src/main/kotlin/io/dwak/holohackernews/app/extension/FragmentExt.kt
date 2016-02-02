@file:JvmName("FragmentUtils")

package io.dwak.holohackernews.app.extension

import android.os.Bundle
import android.support.v4.app.Fragment
import java.io.Serializable

inline fun <T : Fragment> T.with(f : Bundle.() -> Unit) : T {
    val args = Bundle()
    f.invoke(args)
    arguments = args
    return this
}

@Suppress("UNCHECKED_CAST")
fun <T : Serializable> Fragment.getSerializable(key : String) = arguments.getSerializable(key) as T
fun Fragment.getInt(key : String, defaultValue : Int = 0) = arguments.getInt(key, defaultValue)
fun Fragment.getLong(key : String, defaultValue : Long = 0) = arguments.getLong(key, defaultValue)
fun Fragment.getBoolean(key : String, defaultValue : Boolean = false) = arguments.getBoolean(key, defaultValue)
fun Fragment.getString(key : String, defaultValue : String? = null) : String? = arguments.getString(key, defaultValue)
